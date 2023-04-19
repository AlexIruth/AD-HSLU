/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw03.D2.BinaryTree;

/**
 *
 * @author alexi
 */
public class Node {

    private final int element;
    private Node childRight;
    private Node childLeft;

    public Node(int element) {
        this.element = element;
    }

    public Node getChildRight() {
        return childRight;
    }

    public Node getChildLeft() {
        return childLeft;
    }

    public int getElement() {
        return element;
    }

    public void setChildRight(Node childright) {
        this.childRight = childright;
    }

    public void setChildLeft(Node childleft) {
        this.childLeft = childleft;
    }

}
