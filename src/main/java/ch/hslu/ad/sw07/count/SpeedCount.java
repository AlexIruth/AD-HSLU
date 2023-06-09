/*
 * Copyright 2022 Hochschule Luzern Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.ad.sw07.count;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors; 
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Speed-Test für unterschiedlich implementierte Counters.
 */
public final class SpeedCount {
    
    private static final Logger LOG = LogManager.getLogger(SpeedCount.class);

    /**
     * Privater Konstruktor.
     */
    private SpeedCount() {
    }

    /**
     * Test für einen Counter.
     *
     * @param counter Zählertyp.
     * @param counts Anzahl Zähl-Vorgänge.
     * @param tester Anzahl Tester-Threads.
     * @return Dauer des Tests in mSec.
     */
    public static long speedTest(Counter counter, int counts, int tester) {
        final ExecutorService executor = Executors.newCachedThreadPool();
        long start = System.nanoTime();
        for (int i = 0; i < tester; i++) {
            executor.submit(new CountTask(counter, counts));
        }
        executor.shutdown();
        try {
            if (!executor.awaitTermination(tester, TimeUnit.SECONDS)) {
                return -1L;
                
            }
        } catch (InterruptedException ex) {
            LOG.debug(ex);
        }
        
        long duration = System.nanoTime() - start;
        
        return duration;
    }

    /**
     * Speedtest Ergebnisse: Der Atomic-Counter ist rund 30 - 50 % schneller als der Sync-Counter! Bei Atomic-Variablen
     * wird direkt der Bus auf der HW blockiert.
     */
    public static void main(final String[] args) {
        final int passes =238;
        final int tester = 7;
        final int counts = 10000;
        final Counter counterSync = new SynchronizedCounter();
        long sumSync = 0;
        for (int i = 0; i < passes; i++) {
            sumSync += speedTest(counterSync, counts, tester);
        }
        final Counter counterAtom = new AtomicCounter();
        long sumAtom = 0;
        for (int i = 0; i < passes; i++) {
            sumAtom += speedTest(counterAtom, counts, tester);
        }
        if (counterSync.get() == 0) {
            LOG.info("Sync counter ok"); //~1ms
            LOG.info("Sync counter average test duration = {} ms", sumSync / ((float) passes * 1_000_000));
        } else {
            LOG.info("Sync counter failed");
        }
        if (counterAtom.get() == 0) {
            LOG.info("Atom counter ok"); //~0.6ms
            LOG.info("Atom counter average test duration = {} ms", sumAtom / ((float) passes * 1_000_000));
        } else {
            LOG.info("Atom counter failed");
        }
    }
}
