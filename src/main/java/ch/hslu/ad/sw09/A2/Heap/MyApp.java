/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw09.A2.Heap;

/**
 *
 * @author alexi
 */
public class MyApp {

    public static void main(String[] args) {
        FixedSizeHeap fixedSizeHeap = new FixedSizeHeap(10);
        fixedSizeHeap.insert(19);
        fixedSizeHeap.insert(29);
        fixedSizeHeap.insert(1029);
        fixedSizeHeap.insert(1209);
        fixedSizeHeap.insert(2);
        fixedSizeHeap.insert(1949);
        fixedSizeHeap.insert(9);
        fixedSizeHeap.insert(19);
        fixedSizeHeap.insert(26);
        System.out.println(fixedSizeHeap.isFull());
        fixedSizeHeap.insert(18);
        System.out.println(fixedSizeHeap.isFull());
        System.out.println(fixedSizeHeap.getMax());
        System.out.println(fixedSizeHeap.getMax());
        System.out.println(fixedSizeHeap.getMax());
        System.out.println(fixedSizeHeap.getMax());

        
        // HeapSort 
        int[] toBeSorted = {2, 34, 235, 5, 45, 24, 3, 6756, 23, 423, 44, 6, 577, 21, 4};
        System.out.println(toBeSorted.length);
        HeapSort.heapSort(toBeSorted);

    }
}
