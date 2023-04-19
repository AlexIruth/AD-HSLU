/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw02.D1.RingbufferQueue;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

/**
 *
 *
 * @author alexi
 * @version $Id: $Id
 */
public class Ringbuffer implements RingbufferInterface {

    private int writerPosition = 0;
    private int readerPosition = 0;
    private int usedSize = 0;
    private char[] ringbuffer;

    public Ringbuffer(final int size) {
        ringbuffer = new char[size];

    }

    @Override

    public boolean IsEmpty() {
        return usedSize <= 0;
    }

    @Override
    public boolean IsFull() {
        return usedSize >= ringbuffer.length;
    }

    @Override
    public boolean enquue(char character) {
        if (IsFull()) {
            throw new BufferOverflowException();

        }
        ringbuffer[writerPosition] = character;
        usedSize++;
        if (writerPosition >= ringbuffer.length - 1) {
            writerPosition = 0;
        } else {
            writerPosition++;
        }

        return true;
    }

    @Override
    public char dequeue() {
        if (IsEmpty()) {
            throw new BufferUnderflowException();
        }
        char element = ringbuffer[readerPosition];
        ringbuffer[readerPosition] = Character.MIN_VALUE; //default Wert von char in java.
        usedSize--;
        if (readerPosition >= ringbuffer.length - 1) {
            readerPosition = 0;
        } else {
            readerPosition++;
        }

        return element;
    }

    @Override
    public int getUsedsize() {
        return usedSize;
    }

    public static void main(String[] args) {
        Ringbuffer ringbuffer = new Ringbuffer(5);
        ringbuffer.enquue('A');
        ringbuffer.enquue('B');
        ringbuffer.enquue('C');
        ringbuffer.enquue('D');
        System.out.println(ringbuffer.getUsedsize());
        System.out.println(ringbuffer.dequeue());
        System.out.println(ringbuffer.dequeue());
        System.out.println(ringbuffer.dequeue());
        System.out.println(ringbuffer.dequeue());
         System.out.println(ringbuffer.getUsedsize());

    }

}
