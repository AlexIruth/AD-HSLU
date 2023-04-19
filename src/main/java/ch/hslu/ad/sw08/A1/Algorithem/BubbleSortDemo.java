package ch.hslu.ad.sw08.A1.Algorithem;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class BubbleSortDemo {

    private static final Logger LOG = LogManager.getLogger(BubbleSortDemo.class);
    private static final int SIZE = 200_000;
    private static final int ITER = 1;

    private static long start = 0;
    private static long duration = 0;

    public static void main(String[] args) {
        int[] masterRandomIntArray = ArrayCreator.newRandomIntArray(SIZE);
        int[] masterReverseSortedIntArray = ArrayCreator.newReverseSortedIntArray(SIZE);
        int[] masterSortedIntArray = ArrayCreator.newSortedIntArray(SIZE);

        start = System.currentTimeMillis();
        for (int i = 0; i < ITER; i++) {
            Sort.bubbleSort(masterRandomIntArray.clone());
        }
        duration = System.currentTimeMillis() - start;
        LOG.info("random array - normal bubbleSort: sorted {} elements in {} ms", SIZE, duration / ITER);

        start = System.currentTimeMillis();
        for (int i = 0; i < ITER; i++) {
            Sort.bubbleSort(masterReverseSortedIntArray.clone());
        }
        duration = System.currentTimeMillis() - start;
        LOG.info("reversed array - normal bubbleSort: sorted {} elements in {} ms", SIZE, duration / ITER);

        start = System.currentTimeMillis();
        for (int i = 0; i < ITER; i++) {
            Sort.bubbleSort(masterSortedIntArray.clone());
        }
        duration = System.currentTimeMillis() - start;
        LOG.info("sorted array - normal bubbleSort: sorted {} elements in {} ms", SIZE, duration / ITER);

  
    }
}
