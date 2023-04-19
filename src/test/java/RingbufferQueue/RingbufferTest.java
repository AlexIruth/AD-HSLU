/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package RingbufferQueue;

import ch.hslu.ad.sw02.D1.RingbufferQueue.Ringbuffer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class RingbufferTest {

    @Test
    public void testIsEmpty() {
        Ringbuffer ringbuffer = new Ringbuffer(3);
        ringbuffer.enquue('A');
        ringbuffer.enquue('B');
        ringbuffer.enquue('C');
        assertFalse(ringbuffer.IsEmpty());

    }

    @Test
    public void testIsEmpty2() {
        Ringbuffer ringbuffer = new Ringbuffer(3);
        assertTrue(ringbuffer.IsEmpty());

    }

    @Test
    public void testIsFull() {
        Ringbuffer ringbuffer = new Ringbuffer(8);
        ringbuffer.enquue('A');
        ringbuffer.enquue('B');
        ringbuffer.enquue('C');
        ringbuffer.enquue('D');
        ringbuffer.enquue('E');
        ringbuffer.enquue('F');
        assertFalse(ringbuffer.IsFull());
    }

    @Test
    public void testIsFull2() {
        Ringbuffer ringbuffer = new Ringbuffer(3);
        ringbuffer.enquue('A');
        ringbuffer.enquue('B');
        ringbuffer.enquue('C');
        assertTrue(ringbuffer.IsFull());
        assertFalse(ringbuffer.IsEmpty());
        assertEquals(true, ringbuffer.IsFull());
    }

    @Test
    public void testEnqueuue() {
        Ringbuffer ringbuffer = new Ringbuffer(3);
        ringbuffer.enquue('A');
        ringbuffer.enquue('B');
        ringbuffer.enquue('C');
        assertEquals(3, ringbuffer.getUsedsize());
        assertFalse(ringbuffer.enquue('D'));

    }

    @Test
    public void testDeque() {
        Ringbuffer ringbuffer = new Ringbuffer(2);
        ringbuffer.enquue('A');
        ringbuffer.enquue('B');
        ringbuffer.dequeue();
        assertEquals(1, ringbuffer.getUsedsize());
        assertEquals('B', ringbuffer.dequeue());
        //  assertEquals(ringbuffer.IsEmpty(), ringbuffer.dequeue());
        // assertEquals(0, ringbuffer.dequeue());

    }

}
