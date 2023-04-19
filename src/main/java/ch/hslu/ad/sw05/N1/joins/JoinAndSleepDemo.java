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
package ch.hslu.ad.sw05.N1.joins;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demonstration von Join und Sleep - Aufgabe 3 - N1_EX_ThreadsSynch.
 */
public class JoinAndSleepDemo {

    private static final Logger LOG = LogManager.getLogger(JoinAndSleepDemo.class);

    /**
     * Main-Demo.
     *
     * @param args not used.
     * @throws InterruptedException wenn Warten unterbrochen wird.
     */
    public static void main(String[] args) throws InterruptedException {
        JoinAndSleepTask joinAndSleepTask3 = new JoinAndSleepTask("joinAndSleepTask3", 4000, null);
        final Thread thread3 = new Thread(joinAndSleepTask3, "joinandSleepTask3");
        JoinAndSleepTask joinAndSleepTask2 = new JoinAndSleepTask("joinAndSleepTask2", 3000, thread3);
        final Thread thread2 = new Thread(joinAndSleepTask2, "joinAndSleepTask2");
        JoinAndSleepTask joinAndSleepTask1 = new JoinAndSleepTask("joinAndSleepTask1", 2000, thread2);
        Thread thread1 = new Thread(joinAndSleepTask1, "joinAndSleepTask1");
        thread1.start();
        thread2.start();
        thread3.start();
        Thread.sleep(3500);
        thread1.interrupt();

      

    }
}
