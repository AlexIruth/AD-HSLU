/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw09.A2.QuickSort;

import ch.hslu.ad.sw08.A1.Algorithem.*;
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
        int j; //
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
        for (int i = 0; i < toBeSorted.length - 1; i++) {// Die Äussere For Schleife kommt in Kraft wenn das ganze Array einmal durgelaufen ist und neu Anfängt
            for (int j = 0; j < toBeSorted.length - 1; j++) {// Die Innere Schlaufe ist für den tausch zuständig so,dass das grössere immer nach rechts geschoben wird 
                if (toBeSorted[j] > toBeSorted[j + 1]) {
                    int temp = toBeSorted[j];
                    toBeSorted[j] = toBeSorted[j + 1]; // Das grössere Element wird nach rechts verschoben -->Hier wird getauscht 
                    toBeSorted[j + 1] = temp;// Das kleinere Element wird nach Links geschoben -->  Hier wird getauscht 
                }
            }
        }
    }

    // Hier wird eine Methode erstellt damit man nur das Char Array mitgeben muss und nicht dierekt left right eingeben muss. > Dies wird in der verschachtelten Methode aufgerufen.
    public static void quickSortForChars(final char[] a) {
        int left = 0;
        int right = a.length - 1;
        quickSortForChars(a, left, right);

    }

    public static final void quickSortForChars(final char[] a, final int left, final int right) {
        int up = left; // linke Grenze --> Beim erzeugen dieser Methode wird left meist als 0 definiert > Von da weg muss er anfangen zu vergleichen und dann sortieren 
        int down = right - 1; // rechte Grenze (ohne Trennelement) > Entspricht auch array.lenth -1
        char t = a[right]; // rechtes Element t als Trennnelement
        boolean allChecked = false;  // Hier wird geprüft ob Eleemente geprüft worden sind. Vor dem Prüfen natürlich false 
        do {
            while (a[up] < t) {
                up++; // suche grösseres (>=) Element von links an
            }
            while ((a[down] >= t) && (down > up)) {
                down--; // suche echt kleineres (<) Element von rechts an
            }
            if (down > up) { // solange keine Überschneidung
                exchange(a, up, down);
                up++;
                down--; // linke und rechte Grenze verschieben
            } else {
                allChecked = true; // Austauschen beendet
            }
        } while (!allChecked);
        exchange(a, up, right); // Trennelement an endgültige Position (a[up]) setzen ---> a[up] ist jetzt die Trennstelle zwischen der rechten und linken Teilfolge 
        if (left < (up - 1)) { // Somit wird hier geprüft wenn left < ist als de linke hälfte quicksort Methode für die linke Hälfte rekursiv aufrufen 
            quickSortForChars(a, left, (up - 1)); // linke Hälfte wird mit quicksort sortiert 
        }
        if ((up + 1) < right) {
            quickSortForChars(a, (up + 1), right); // rechte Hälfte, ohne T’Elt. 
        }
    }

    
    //Hilfsmethode zum vertauschen der Elemente 
    private static final void exchange(final char[] a, final int firstIndex, final int secondIndex) {
        char tmp;
        tmp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = tmp;
    }
    
    
    
     public static void quickSortForInts(final int[] a) {
        int left = 0;
        int right = a.length - 1;
        quickSortForInts(a, left, right);
    }

    public static void quickSortForInts(final int[] a, final int left, final int right) {
        int up = left; // linke Grenze
        int down = right - 1; // rechte Grenze (ohne Trennelement)
        int t = a[right]; // rechtes Element als Trennelement
        boolean allChecked = false;
        do {
            while (a[up] < t) {
                up++; // suche grösseres (>=) Element von links an
            }
            while ((a[down] >= t) && (down > up)) {
                down--; // suche echt kleineres (<) Element von rechts an
            }
            if (down > up) { // solange keine Überschneidung
                exchangeInts(a, up, down);
                up++;
                down--; // linke und rechte Grenze verschieben
            } else {
                allChecked = true; // Austauschen beendet
            }
        } while (!allChecked);
        exchangeInts(a, up, right); // Trennelement an endgültige Position (a[up])
        if (left < (up - 1)) quickSortForInts(a, left, (up - 1)); // linke Hälfte
        if ((up + 1) < right) quickSortForInts(a, (up + 1), right); // rechte Hälfte, ohne T’Elt.
    }

    private static void exchangeInts(final int[] a, final int firstIndex, final int secondIndex) {
        int tmp;
        tmp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = tmp;
    }

}
