/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw09.A2.Heap;

import java.util.NoSuchElementException;

/**
 *
 * @author alexi
 */
public class FixedSizeHeap implements IntegerHeap {

    private int[] heap;
    private int firstFreeIndex = 0;
    private final int STATIC_SIZE;

    public FixedSizeHeap(final int size) {
        this.heap = new int[size];
        STATIC_SIZE = size;
    }

    @Override
    public int getMax() {
        if (this.firstFreeIndex == 0) {
            throw new NoSuchElementException("Heap is empty!");
        }
        int max = this.heap[0];  // Hier setzt ich das maximal Element,dass an dem Index 0 steht. 
        this.heap[0] = this.heap[firstFreeIndex - 1]; // Der Index an der Stelle 0 wird mit dem letzten eingefügten Wert getauscht 
        this.heap[firstFreeIndex - 1] = 0; // Der letzte Eingefügte Wert ist jetzt 0 --> Zeigt das Löschen an des Max Elements, da ein Index nur überschrieben werden kan in einem Array.
        sink(0); // Sinkprozess durchführen und reorganisieren vom Index 0 aus 
        this.firstFreeIndex--;
        return max;
    }

    private void sink(final int index) {  // Sinkprozess durchführen 
        int indexOfLeftChild = (2 * index) + 1;
        int indexOfRightChild = 2 * (index + 1);
        if (indexOfLeftChild > STATIC_SIZE - 1 || indexOfRightChild > STATIC_SIZE - 1) {
            return;
        }
        if (this.heap[indexOfLeftChild] > this.heap[indexOfRightChild]
                && this.heap[indexOfLeftChild] > this.heap[index]) {
            exchange(indexOfLeftChild, index);
            sink(indexOfLeftChild);
        } else if (this.heap[indexOfRightChild] > this.heap[indexOfLeftChild]
                && this.heap[indexOfRightChild] > this.heap[index]) {
            exchange(indexOfRightChild, index);
            sink(indexOfRightChild);
        }
    }

    @Override
    public void insert(int toInsert) {
        if (this.firstFreeIndex == STATIC_SIZE) {
            throw new ArrayIndexOutOfBoundsException("Heap is all ready full!");
        }
        this.heap[firstFreeIndex] = toInsert;
        if (this.firstFreeIndex != 0) {
            climb(this.firstFreeIndex);  // Steigprozess durchführen vom Index an dem Index an dem ich einfüge. 
        }
        this.firstFreeIndex++;
    }

    private void climb(final int index) { // Steigprozesss durchführen
        int indexOfFather = (index - 1) / 2;
        if (this.heap[indexOfFather] < this.heap[index]) {  // Wenn der Vater des Elements kleiner ist als die Söhne tauschen und weiter rekursiv mit der methode Hochklettern --> climb 
            exchange(indexOfFather, index);
            climb(indexOfFather);
        }
    }

    private void exchange(final int first, final int second) {
        int temp = this.heap[second];
        this.heap[second] = this.heap[first];
        this.heap[first] = temp;
    }

    @Override
    public boolean isFull() {
        return this.firstFreeIndex == STATIC_SIZE;
    }

    @Override
    public boolean IsEmpty() {
        return this.firstFreeIndex == 0;
    }

}
