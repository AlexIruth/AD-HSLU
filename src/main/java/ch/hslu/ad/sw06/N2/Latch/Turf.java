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
package ch.hslu.ad.sw06.N2.Latch;

import java.util.logging.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Eine Rennbahn für das Pferderennen.
 */
public final class Turf {

    private static final Logger LOG = LogManager.getLogger(ch.hslu.ad.sw06.N2.Latch.Turf.class);
    private static final int HORSES = 10;

    /**
     * Turf ist die Pferdebahn Privater Konstruktor.
     */
    private Turf() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        final Synch starterBox = new Latch(); // Starter Box indem die Pferde satrten
        Thread[] horses = new Thread[HORSES]; // Hier wird ein Array von Typ Thread erzeugt der Platz für 10 hat 
        for (int i = 0; i < HORSES; i++) {  // Anschliessend wird durch die Threads durch iteriert 
            horses[i] = new Thread(new RaceHorse(starterBox), "Horse " + i);
            horses[i].start();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

       // synchronized (starterBox) 
       
       {  // Hier findet ein Reenternt Monitor statt synchronised wird auf startBox aufgerufen und in der synchronised wird die release Methode aufgerufen die wiederum den gleichen Lock besitzt 
            LOG.info("Start...");
            starterBox.release();
            // for (Thread horse : horses) {
            //horse.interrupt();
            //}
        }

    }
}
