/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.ad.sw01.D1.Stack;

import ch.hslu.ad.sw02.D1.Stack.ArrayStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author alexi
 */
public class ArrayStackTest {

    @Test
    public void testIsEmpty() {
        ArrayStack arraystack = new ArrayStack(10);
        assertTrue(arraystack.isEmpty());
        assertEquals(0, arraystack.size());
    }

    @Test
    public void testPush() {
        ArrayStack arraystack = new ArrayStack(10);
        arraystack.push("HANS");
        assertEquals(1, arraystack.size());
        // assertFalse(arraystack.isEmpty());
    }

    @Test
    public void testIsFull() {
        ArrayStack arraystack = new ArrayStack(4);
        arraystack.push("Peter");
        arraystack.push("Hans");
        arraystack.push("Gustav");
        arraystack.push("Alex");
        assertTrue(arraystack.IsFull());
        assertEquals(4, arraystack.size());

    }
}
