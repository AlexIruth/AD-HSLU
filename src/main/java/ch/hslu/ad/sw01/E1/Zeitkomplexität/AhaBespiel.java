/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw01.E1.Zeitkomplexität;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <p>AhaBespiel class.</p>
 *
 * @author alexi
 * @version $Id: $Id
 */
public class AhaBespiel {

    private static final Logger LOG = LogManager.getLogger(AhaBespiel.class);
    private static long task1Counter = 0;
    private static long task2Counter = 0;
    private static long task3Counter = 0;

    /**
     * <p>task.</p>
     *
     * @param n a int
     */
    public static void task(final int n) {
        task1();
        task1();
        task1();
        task1(); // T ~ 4
        for (int i = 0; i < n; i++) { // äussere Schleife: n-mal
            task2();
            task2();
            task2(); // T ~ n · 3
            for (int j = 0; j < n; j++) { // innerer Schleife: n-mal
                task3();
                task3(); // T ~ n · n· 2
            }
        }
    }

    /**
     * <p>task1.</p>
     */
    public static void task1() {
        try {
            Thread.sleep(5);
        } catch (Exception e) {
        }
        task1Counter++;

    }

    /**
     * <p>task2.</p>
     */
    public static void task2() {
        try {
            Thread.sleep(5);
        } catch (Exception e) {
        }
        task2Counter++;
    }

    /**
     * <p>task3.</p>
     */
    public static void task3() {
        try {
            Thread.sleep(5);
        } catch (Exception e) {
        }
        task3Counter++;
    }

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        task(32);
        LOG.info(" Task 1 was called " + task1Counter + " times ");
        LOG.info(" Task 2 was called " + task2Counter + " times ");
        LOG.info(" Task 3 was called " + task3Counter + " times ");
    }

}
