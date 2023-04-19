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
package ch.hslu.ad.sw07.N3.prime;

import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 100 grosse Primzahlen produzieren.
 */
public final class PrimeCheckUpdated {

    private static final Logger LOG = LogManager.getLogger(ch.hslu.ad.sw07.N3.prime.PrimeCheckUpdated.class);
    private static final int PRIMES_TO_FIND = 100;

    /**
     * Privater Konstruktor.
     */
    public PrimeCheckUpdated() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        BlockingQueue<BigInteger> primeQueue = new ArrayBlockingQueue<>(PRIMES_TO_FIND);
        int taskCount = Runtime.getRuntime().availableProcessors() + 1; // TaskCount entscheidet wie viele Threads ausgeführt werden.
        ExecutorService executor = Executors.newFixedThreadPool(taskCount); // Es laufen so viele Threads wie taskCount---> 13 Threads 
        LOG.info("Created Threads = " + taskCount);

        for (int i = 0; i < taskCount; i++) {
            executor.submit(new FindPrimeTask(primeQueue, PRIMES_TO_FIND));

        }

    }
}
