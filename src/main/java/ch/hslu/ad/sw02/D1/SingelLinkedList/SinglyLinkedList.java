/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw02.D1.SingelLinkedList;

/**
 * <p>
 * SinglyLinkedList class.</p>
 *
 * @author alexi
 * @version $Id: $Id
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SinglyLinkedList {

    private Node head;
    private int size = 0;  //Variable size lokal gesoeichert, weniger rechen Intensiv. 

    public SinglyLinkedList() {
        this.head = null;
        // this.head = new Node<Car>(null); //Head wird anfangs, bei einer leeren Liste als null Initialisiert.
    }

    public Node getHead() {
        return head;
    }

    public int size() {
        return size;

    }

    public void add(Car element) {

        Node node = new Node(element);
        node.setNext(head);
        head = node;
        size++;
    }

    public boolean remove(Car element) {
        if (isEmpty()) {
            return false;    //Wenn die Liste leer ist,kann man nichts entfernen.

        }
        Node current = head;
        Node previous = head;
        if (current.getElement().equals(element)) { //Wenn man den Head enfernt 
            pop();
            return true;

        }
        while (current.hasNext()) {  // 
            if (element.equals(current.getElement())) {
                previous.setNext(current.getNext());
                size--;
                return true;
            }
            previous = current;
        }
        return false;

    }

    public void clear() {
        head = new Node(null);
        size = 0;
    }

    public boolean isEmpty() { // Die Methode wird gebraucht, um Bedingungen zu prüfen 
        return size == 0;
    }

    public boolean contains(Car element) {
        if (isEmpty()) {
            return false;

        }
        Node current = head;
        if (current.getElement().equals(element)) {
            return true;

        }
        while (current.hasNext()) {
            if (current.getNext().getElement().equals(element)) {
                return true;

            }
            current = current.getNext();

        }
        return false;
    }

    public Car pop() {
        Car element = head.getElement();
        head = head.getNext();
        size--;
        return element;
    }

}
