/*
 * Copyright 2022 Hochschule Luzern - Informatik.
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
package ch.hslu.ad.sw06.N2.Waitpool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Einfacher Task für die Demonstration eines Wait-Pools.
 */
public final class MyTask implements Runnable {

    private static final Logger LOG = LogManager.getLogger(MyTask.class);
    private final Object lock; // Das lock ist in diesem Fall die gemeinsame Resource. 

    /**
     * Erzeugen einen Task.
     *
     * @param lock für die Synchronisation
     */
    public MyTask(final Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        LOG.info("warten...");
        synchronized (lock) {
            try {
                lock.wait();  // Hier wurde lock von mir ergänzt, da lock in einem synchroised Block und somit auf die gemeinsame Ressource auch geschützt werden muss
            } catch (InterruptedException ex) {
                /* handling... */
                return;
            }
        }
        LOG.info("...aufgewacht");
    }
}
