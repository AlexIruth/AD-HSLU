/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw08.A1.Algorithem;

import java.util.Arrays;

public class Sort {

    /**
     * Sortiert, dass int aufsteifend
     *
     * @param tobesortedArray ist, dass zu sortierende Array.
     *
     * @author alexi
     */
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

    public static void selectionSort(int[] toBeSorted) {

        int leastIndex; // leastIndex ist der aktuelle Position,mit dem kleinsten Wert nach dem durchlaufen des Arrays getauscht wird. 
        for (int i = 0; i < toBeSorted.length - 1; i++) { //Äussere For Schleife wird nach dem kompletten durchlauf der inneren Schlaufe die aktuelle Positon erhöhen 
            leastIndex = i;
            for (int j = i + 1; j < toBeSorted.length; j++) { 
                if (toBeSorted[leastIndex] > toBeSorted[j]) {// Innere For Schleife wird durch dass ganze Array durchlaufen und mit der aktuellen Positon verglichen , dass kleinst element wird jewils getauscht
                    leastIndex = j;// Wenn der Wert bei der aktuellen Index grösser ist dann leastIndex neu setzen 

                }
                int tmp = toBeSorted[leastIndex];// Tmp variable erstellen 
                toBeSorted[leastIndex] = toBeSorted[i]; //  Einfacher Wechsel --> Der neuer gefundene Kleinste Wert wird an die Positon geschoben mi der Verglichen wird 
                toBeSorted[i] = tmp;// Der Wert an der aktuellen Position wird an die Position verschoben wo der kleinste wert war 

            }
        }
    }
    // Austausch Sortieren --> Die Grösseren Elemente werden immer mehr nach reechts geschoben
    //Vergleicht die Elemenete Paarweise --> Sortieren durch Aufsteigen  -->  Stabil  
    // Nach n-1 Durchläufen isch das Array sorrtiert 
    
    public static void bubbleSort(final int[] toBeSorted) {
        for (int i = 0; i < toBeSorted.length - 1; i++)   {// Die Äussere For Schleife kommt in Kraft wenn das ganze Array einmal durgelaufen ist und neu Anfängt
            for (int j = 0; j < toBeSorted.length - 1; j++) {// Die Innere Schlaufe ist für den tausch zuständig so,dass das grössere immer nach rechts geschoben wird 
                if (toBeSorted[j] > toBeSorted[j + 1]) {
                    int temp = toBeSorted[j];
                    toBeSorted[j] = toBeSorted[j + 1]; // Das grössere Element wird nach rechts verschoben -->Hier wird getauscht 
                    toBeSorted[j + 1] = temp;// Das kleinere Element wird nach Links geschoben -->  Hier wird getauscht 
                }
            }
        }
    }


    
}
