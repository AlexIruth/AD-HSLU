/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw02.D1.SingelLinkedList;

import ch.hslu.ad.sw02.D1.SingelLinkedList.Car;
import ch.hslu.ad.sw02.D1.SingelLinkedList.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junitpioneer.jupiter.params.DisableIfAllArguments;

/**
 *
 * @author alexi
 */
public class SinglyLinkedListTest {

    SinglyLinkedList singlyLinkedList;
    Car car1;
    Car car2;
    Car car3;
    Car car4;

    @BeforeEach
    public void setup() {
        singlyLinkedList = new SinglyLinkedList();
        car1 = new Car("BMW", 325);
        car2 = new Car("Porsche", 911);
        car3 = new Car("Ferrari", 1);
        car4 = new Car("Mercedes", 63);
    }

    @Test
    public void testGetHead() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(car1);
        assertEquals(car1, singlyLinkedList.getHead().getElement());

    }

    @Test
    public void testNullSize() {
        assertEquals(0, singlyLinkedList.size());
    }

    @Test
    public void testSizeAfterAdd() {
        singlyLinkedList.add(car1);
        singlyLinkedList.add(car2);
        singlyLinkedList.add(car3);
        assertEquals(3, singlyLinkedList.size());
    }

    @Disabled
    @Test
    public void testContains() {
        singlyLinkedList.add(car1);
        singlyLinkedList.add(car2);
        singlyLinkedList.add(car3);
        assertEquals(false, singlyLinkedList.contains(car4));

        // assertEquals(true, singlyLinkedList.contains(car1));
        // assertEquals(true, singlyLinkedList.contains(car2));
        // assertEquals(true, singlyLinkedList.contains(car3));
    }

    @Test
    public void testContainsEmpty() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        assertEquals(false, singlyLinkedList.contains(car4));

    }

    @Disabled
    @Test
    public void testContainsMultipleElements() {
        singlyLinkedList.add(car1);
        singlyLinkedList.add(car2);
        singlyLinkedList.add(car3);
        assertTrue(singlyLinkedList.contains(car1));

    }

    @Disabled
    @Test
    public void testContainsEmpty2() {
        assertTrue(singlyLinkedList.contains(car1));
    }

    @Disabled
    @Test
    public void testIsEmpty() {
        assertEquals(true, singlyLinkedList.isEmpty());
        singlyLinkedList.add(car2);
        singlyLinkedList.add(car3);
        assertEquals(false, singlyLinkedList.isEmpty());
    }

    @Disabled
    @Test
    public void testPop() {
        singlyLinkedList.add(car2);
        singlyLinkedList.add(car3);
        assertEquals(car3, singlyLinkedList.pop());
    }

    @Disabled
    @Test
    public void testPopsize() {
        singlyLinkedList.add(car2);
        singlyLinkedList.add(car3);
        singlyLinkedList.pop();
        assertEquals(1, singlyLinkedList.size());
        singlyLinkedList.pop();
        assertEquals(0, singlyLinkedList.size());
        System.out.println("ch.hslu.sw02.D1.SingelLinkedList.SinglyLinkedListIT.testPopsize()");

    }

    @Disabled
    @Test
    public void testRemoveFromEmptyList() {
        assertFalse(singlyLinkedList.remove(car1));
        assertEquals(0, singlyLinkedList.size());

    }

    @Disabled
    @Test
    public void testRemovefromaddedList() {
        singlyLinkedList.add(car1);
        singlyLinkedList.add(car3);
        singlyLinkedList.add(car4);
        assertTrue(singlyLinkedList.remove(car3));
        assertTrue(singlyLinkedList.remove(car1));
        assertFalse(singlyLinkedList.remove(car2));
    }

    @Disabled
    @Test
    public void testRemoveHead() {
        singlyLinkedList.add(car1);
        singlyLinkedList.add(car3);
        singlyLinkedList.add(car4);
        singlyLinkedList.remove(car4);
        assertEquals(car3, singlyLinkedList.getHead());

    }
}
