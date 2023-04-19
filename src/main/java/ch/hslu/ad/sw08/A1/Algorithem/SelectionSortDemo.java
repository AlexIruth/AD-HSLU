/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw08.A1.Algorithem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author alexi
 */
public class SelectionSortDemo {

    private static final Logger LOG = LogManager.getLogger(InsertionSortDemo.class);

    public static void main(String[] args) {
        final int SIZE = 20_000;

        // Laufzeitmessung für grosse Arrays bei verschiedenen n
        int[] randomIntArray = ArrayCreator.newRandomIntArray(SIZE); // Zufälliges Array
        int[] sortedIntArray = ArrayCreator.newSortedIntArray(SIZE); //Zufällig Sortiertes Array 
        int[] resersedSortedArray = ArrayCreator.newReverseSortedIntArray(SIZE);// Zufällig Umgekehrt Sortiert 

        long start = System.currentTimeMillis();
        Sort.selectionSort(randomIntArray);
        long duration = System.currentTimeMillis() - start;

        LOG.info("avrage case for Random Array : sorted {} random elements in {} ms ", SIZE, duration);

        start = System.currentTimeMillis();
        Sort.selectionSort(sortedIntArray);
        duration = System.currentTimeMillis() - start;

        LOG.info("avrage case for Random Array : sorted {} random elements in {} ms ", SIZE, duration);

        start = System.currentTimeMillis();
        Sort.selectionSort(resersedSortedArray);
        duration = System.currentTimeMillis() - start;

        LOG.info("avrage case for Random Array : sorted {} random elements in {} ms ", SIZE, duration);
    }

}
