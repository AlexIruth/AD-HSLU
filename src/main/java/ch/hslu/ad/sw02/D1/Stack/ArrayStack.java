/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw02.D1.Stack;

import ch.hslu.ad.sw01.E1.Zeitkomplexität.AhaBespiel;
import java.awt.image.IndexColorModel;
import java.util.EmptyStackException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayStack implements Stack {

    private int currentIndex = 0;
    private final String[] stack;

    public ArrayStack(final int size) {
        this.stack = new String[size];

    }

    @Override
    public boolean isEmpty() {

        return currentIndex == 0;

    }

    @Override
    public boolean IsFull() {
        return currentIndex == stack.length;
    }

    @Override
    public boolean push(String element) {
        if (IsFull()) {
            throw new StackOverflowError("Stack is already Full"); //Stack is Full

        }
        stack[currentIndex] = element;
        currentIndex++;
        return true;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();

        }

        String element = stack[currentIndex];
        stack[currentIndex] = null;
        currentIndex--;
        return element;

    }

    @Override
    public int size() {
        return currentIndex;

    }

    @Override
    public String peek() {
        if (isEmpty()) {
            throw new EmptyStackException();

        }
        return stack[currentIndex - 1];
    }

    @Override
    public int getcurrentIndex() {
        return currentIndex;
    }

}
