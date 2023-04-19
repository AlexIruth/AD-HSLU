/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw02.D1.SingelLinkedList;

/**
 * <p>Node class.</p>
 *
 * @author alexi

 * @version $Id: $Id
 */
public class Node {

    private Node next;
    private Car element;

    /**
     * <p>Constructor for Node.</p>
     *
     * @param element a {@link ch.hslu.ad.sw02.D1.SingelLinkedList.Car} object
     */
    public Node(Car element) {
        this.element = element;
    }

    /**
     * <p>Getter for the field <code>next</code>.</p>
     *
     * @return a {@link ch.hslu.ad.sw02.D1.SingelLinkedList.Node} object
     */
    public Node getNext() {
        return next;
    }

    /**
     * <p>Setter for the field <code>next</code>.</p>
     *
     * @param next a {@link ch.hslu.ad.sw02.D1.SingelLinkedList.Node} object
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * <p>hasNext.</p>
     *
     * @return a boolean
     */
    public boolean hasNext() {
        return next != null;
    }

    /**
     * <p>Getter for the field <code>element</code>.</p>
     *
     * @return a {@link ch.hslu.ad.sw02.D1.SingelLinkedList.Car} object
     */
    public Car getElement() {
        return element;
    }

    /**
     * <p>Setter for the field <code>element</code>.</p>
     *
     * @param element a {@link ch.hslu.ad.sw02.D1.SingelLinkedList.Car} object
     * @return a {@link ch.hslu.ad.sw02.D1.SingelLinkedList.Car} object
     */
    public Car setElement(Car element) {
        return this.element = element;
    }

}
