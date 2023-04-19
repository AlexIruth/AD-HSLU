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
 * Parametrierbarer Task, der auf einen fremden Thread wartet und danach für eine bestimmte Zeit schläft.
 */
public class JoinAndSleepTask implements Runnable {

    private static final Logger LOG = LogManager.getLogger(JoinAndSleepTask.class);
    private final String taskName;
    private Thread joinFor;
    private final int sleepTime;

    /**
     * Erzeugt einen Task mit Namen.
     *
     * @param taskName der Name des Tasks.
     * @param sleepTime die Zeit in mSec die der Task schläft.
     */
    public JoinAndSleepTask(final String taskName, final int sleepTime, Thread joinFor) {
        this.taskName = taskName;
        this.joinFor = null; // Der Thread joinFor ist definiert als, der Thread der Ausgeführt werden muss bevor der aktuelle aufgerufene Thread starten kann.
        this.sleepTime = sleepTime;
        this.joinFor = joinFor;
    }

    /**
     * Hier wird auf das Ende des fremden Threads gewartet und danach für eine bestimmte Zeit geschlafen. Beide Teile
     * können unterbrochen werden.
     */
    @Override
    public void run() {
        if (this.joinFor != null) {
            try {
                LOG.info("joining: " + this.taskName);
                this.joinFor.join();  // (Z.b. Wenn thread1 gestartet wird ist joinFor = thread2)-> Es wird sichergestellt,dass thread2 erst abgearbeitet wird wenn thread1 komplett beendet ist 
            } catch (InterruptedException e) {
                LOG.info(" Thread interrupted join:  " + this.taskName);
                 return;
            }
       
        }

        try {
            LOG.info("Sleep started:" + this.taskName);
            Thread.sleep(sleepTime);   // main Methode
            LOG.info("sleep finished: " + this.taskName);
        } catch (InterruptedException e) {
            LOG.info("Thread Interuppted sleep   " + this.taskName);
                 return;
        }
   

    }
}
