/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.ad.sw02.D1.RingbufferQueue;

/**
 * <p>RingbufferInterface interface.</p>
 *
 * @author alexi
 * @version $Id: $Id
 */
public interface RingbufferInterface {

    /**
     * <p>IsEmpty.</p>
     *
     * @return a boolean
     */
    public boolean IsEmpty();

    /**
     * <p>IsFull.</p>
     *
     * @return a boolean
     */
    public boolean IsFull();

    /**
     * <p>enquue.</p>
     *
     * @param character a char
     * @return a boolean
     */
    public boolean enquue(char character);

    /**
     * <p>dequeue.</p>
     *
     * @return a char
     */
    public char dequeue();

    /**
     * <p>getUsedsize.</p>
     *
     * @return a int
     */
    public int getUsedsize();

}
