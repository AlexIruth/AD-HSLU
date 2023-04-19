/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw01.E1.IterativRekursiv;

import java.time.Clock;

/**
 * <p>ggtIterativ class.</p>
 *
 * @author alexi
 * @version $Id: $Id
 */
public class ggtIterativ {

    /**
     * <p>ggtIterativ1.</p>
     *
     * @param a a int
     * @param b a int
     * @return a int
     */
    public static int ggtIterativ1(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;
            }

        }
        return b; //* Kann auch b zurück gegeben werden, da es nicht drauf an kommt, weil beides gleich ist. 
    }

    /**
     * <p>getIterativ2.</p>
     *
     * @param a a int
     * @param b a int
     * @return a int
     */
    public static int getIterativ2(int a, int b) {
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

        }
        return (a + b); //* Entweder ist a oder b 0!!! 
    }

    /**
     * <p>ggtRekursiv.</p>
     *
     * @param a a int
     * @param b a int
     * @return a int
     */
    public static int ggtRekursiv(final int a, final int b) {
        if (a > b) {
            return ggtRekursiv(a - b, b);

        } else {
            if (a < b) {

                return ggtRekursiv(a, b - a);

            } else {
                return b;
            }
        }
    }

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {

        System.out.println(ggtIterativ1(16, 4));
        System.out.println(ggtIterativ1(15, 125));
        System.out.println(getIterativ2(82, 26));
        System.out.println(getIterativ2(23, 345));
        System.out.println(ggtRekursiv(25, 15));
        System.out.println(ggtRekursiv(35, 15));

    }

}
