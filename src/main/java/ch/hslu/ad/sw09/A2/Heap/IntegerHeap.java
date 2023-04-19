/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.ad.sw09.A2.Heap;

/**
 *
 * @author alexi
 */
public interface IntegerHeap {

    public int getMax();

    public void insert(int ToInsert);

    public boolean isFull();

    public boolean IsEmpty();
}
