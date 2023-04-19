/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw09.A2.Heap;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author alexi
 */
public class HeapSort {

    private static final Logger LOG = LogManager.getLogger(HeapSort.class);

    public static int[] heapSort(final int[] toBeSorted) {
        int length = toBeSorted.length;
        LOG.info("input: {}", Arrays.toString(toBeSorted));
        IntegerHeap heap = new FixedSizeHeap(length);
        int[] sorted = new int[length];
        for (int integer : toBeSorted) {
            heap.insert(integer);
        }
        LOG.info("heap: {}", heap.toString());
        for (int i = 1; i <= length; i++) {
            int max = heap.getMax();
            LOG.info(max);
            sorted[length - i] = max;
        }
        LOG.info("output: {}", Arrays.toString(sorted));
        return sorted;
    }

}
