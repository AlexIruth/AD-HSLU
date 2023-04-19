/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Versuche;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author alexi
 */
public class Counter {

    public static void main(String[] args) {
        int[] tobeSortedArray = {2,4,3,345,2414,324,345,5,235,23};
        insertionSort2(tobeSortedArray);
    }

    public static void insertionSort2(final int[] tobeSortedArray) {
        int elt; // Nächstes Element,dass eingefügt wird.
        int j; // sortiete stele 
        int[] tmpArray = new int[tobeSortedArray.length + 1]; // Hier wird ein Temporäres Array erzeugt mit der gleichen grösse wie das zu sortierende Array 
        System.arraycopy(tobeSortedArray, 0, tmpArray, 1, tobeSortedArray.length); // Hier wird das zu sortierende Array in ein temp Array gespeichert 
        for (int i = 2; i < tmpArray.length; i++) {  // Index beginnt erst ab der Stelle 2, da 1 das erste Element ist,dass eingefügt werden kann.
            elt = tmpArray[i]; //Nächstes Element,dass eingefügt wird 
            tmpArray[0] = elt; // Dummy Element 
            j = i;
            while (tmpArray[j - 1] > elt) {
                tmpArray[j] = tmpArray[j - 1]; // Wenn, dass schon Sortierte Element [j-1] grösser ist als das einfügende Element an der Stelle[j] wird es nach rechts geschoben
                j--;

            }
            tmpArray[j] = elt;

        }
        System.arraycopy(tmpArray, 1, tobeSortedArray, 0, tobeSortedArray.length); // Hier wird,dass Temporäre Array zurück ins Array kopiert wo zu Sortierend ist. 

    }
}
