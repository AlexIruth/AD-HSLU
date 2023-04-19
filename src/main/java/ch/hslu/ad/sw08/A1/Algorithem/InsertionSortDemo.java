/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw08.A1.Algorithem;

import java.util.Arrays;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author alexi
 */
public class InsertionSortDemo {

    private static final Logger LOG = LogManager.getLogger(InsertionSortDemo.class);
    private static int SIZE = 200_000;

    public static void main(String[] args) {

        // Laufzeitmessung für grosse Arrays bei verschiedenen n
        int[] randomIntArray = ArrayCreator.newRandomIntArray(SIZE); // Zufälliges Array
        int[] sortedIntArray = ArrayCreator.newSortedIntArray(SIZE); //Zufällig Sortiertes Array 
        int[] resersedSortedArray = ArrayCreator.newReverseSortedIntArray(SIZE);// Zufällig Umgekehrt Sortiert 

        long start = System.currentTimeMillis();

        Sort.insertionSort2(randomIntArray);

        long duration = System.currentTimeMillis() - start;
        LOG.info("avrage case for Random Array : sorted {} random elements in {} ms ", SIZE, duration);

        start = System.currentTimeMillis();
 
        Sort.insertionSort2(sortedIntArray);

        duration = System.currentTimeMillis() - start;
        LOG.info("avrage case for Sorted Array : sorted {} random elements in {} ms ", SIZE, duration);

        start = System.currentTimeMillis();

        Sort.insertionSort2(resersedSortedArray);

        duration = System.currentTimeMillis() - start;
        LOG.info("avrage case for Sorted Array : sorted {} random elements in {} ms ", SIZE, duration);

        Sort sort = new Sort();
        int[] a = {1203, 320, 43, 44, 42, 2, 1};
        System.out.println(Arrays.toString(a));
        Sort.insertionSort2(a);
        System.out.println(Arrays.toString(a));

    }
}
