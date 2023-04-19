/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw01.E1.FibonacciZahlen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>FibonacciRecIterDemo class.</p>
 *
 * @author alexi
 * @version $Id: $Id
 */
public class FibonacciRecIterDemo {

    private static List<Integer> fiboZahlen = new ArrayList<>();

    /**
     * <p>fiborec1.</p>
     *
     * @param n a int
     * @return a int
     */
    public static int fiborec1(int n) {
        {
            if (n == 0) /* Rekursionsbasis **/ {

                return 0;

            }
            if (n == 1) /* Rekursionsbasis **/ {

                return 1;
            }
            return fiborec1(n - 1) + fiborec1(n - 2);
            /*Rekursionsvorschrifft**/

        }

    }

    private static int fiborec2(int n) {
        if (fiboZahlen.size() >= n + 1) /* Rekursionsbasis **/ {  //* Hier wird geschaut ob die Zahl schon gespeichert ist 
            return fiboZahlen.get(n);

        }
        int fiboToAdd;
        if (n <= 1)/* Rekursionsbasis **/ {
            fiboToAdd = n;

        } else {
            fiboToAdd = fiborec2(n - 2) + fiborec2(n - 1);
            /*Rekursionsvorschrifft**/

        }
        fiboZahlen.add(fiboToAdd);
        return fiboToAdd;
    }

    private static int fiboIter(final int n) {
        int prev = 0;
        int current = 1;
        for (int i = 0; i < n; i++) {
            int next = prev + current;

            prev = current;
            current = next;
        }
        return prev;

    }

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        System.out.println(fiborec1(4));
        System.out.println(fiborec2(4));  
        System.out.println(fiboIter(4));
        // System.out.println(fiboZahlen.size());
        // Iterator it = fiboZahlen.iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        //fiboZahlen.clear();
        //System.out.println(fiboZahlen.isEmpty());
    }

}
