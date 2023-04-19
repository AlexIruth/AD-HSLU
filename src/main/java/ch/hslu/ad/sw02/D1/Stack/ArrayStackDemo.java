/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw02.D1.Stack;

import java.util.Arrays;

/**
 * <p>
 * ArrayStackDemo class.</p>
 *
 * @author alexi
 * @version $Id: $Id
 */
public class ArrayStackDemo {

    /**
     * <p>
     * main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(8);

        System.out.println(arrayStack.push("hallo"));
        System.out.println(arrayStack.push("hallo"));
        System.out.println(arrayStack.push("lo"));
        System.out.println(arrayStack.push("hlo"));
        System.out.println(arrayStack.peek());
    System.out.println(arrayStack.getcurrentIndex());
    }

}
