/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw03.D2.BinaryTree;

import com.sun.java.accessibility.util.EventID;
import javax.lang.model.element.Element;
import org.apache.logging.log4j.ThreadContext;

/**
 *
 * @author alexi
 */
public class CustomTree implements Treeable {

    private Node root = null;

    public CustomTree() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);

        this.root = five;
        five.setChildLeft(three);
        three.setChildLeft(two);
        three.setChildRight(four);
        two.setChildLeft(one);
        five.setChildRight(nine);
        nine.setChildLeft(seven);
        seven.setChildLeft(six);
        seven.setChildRight(eight);
        nine.setChildRight(ten);
        ten.setChildRight(eleven);
    }

    @Override
    public boolean contains(int element) {
        return search(element);
    }

    @Override
    public boolean search(int element) {
        if (isEmpty()) {
            return false;

        }
        Node searchingFor = searchDeep(root, element);
        if (searchingFor == null) {
            return false;

        } else {
            return true;
        }
    }

    private Node searchDeep(Node actualNode, int element) {
        if (actualNode == null || actualNode.getElement() == element) {
            return actualNode;

        }

        if (actualNode.getElement() > element) {
            System.out.println("Gehe zum Linken Child");
            return searchDeep(actualNode.getChildLeft(), element);

        } else {
            System.out.println("Gehe zum Rechten Child");
            System.out.println("Suche mit Wert" + actualNode.getElement());
            return searchDeep(actualNode.getChildRight(), element);
        }
    }

    private boolean isEmpty() {
        if (root == null) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean add(int element) {
        if (contains(element)) {
            return false;

        }
        if (root == null) {// Erstes Element ,dass eingefügt wird.
            root = new Node(element);
            return true;
        }
        return insert(root, element);

    }

    private boolean insert(Node node, int element) {
        if (element > node.getElement()) { //Schaut den rechten Teil Baum an.
            if (node.getChildRight() != null) {
                return insert(node.getChildRight(), element);

            }
            node.setChildRight(new Node(element));
            return true;
        } else {//Schaut auf den linken Teil Baum.
            if (node.getChildLeft() != null) {
                return insert(node.getChildLeft(), element);

            }
            node.setChildLeft(new Node(element));
            return true;
        }

    }

    public void inorder() {
        if (isEmpty() == false) {
            inorder(root);

        }

    }

    private void inorder(Node actual) {
        if (actual != null) {
            inorder(actual.getChildLeft());
            System.out.println(actual.getElement() + ";");
            inorder(actual.getChildRight());

        }
    }

    public void postorder() {
        if (isEmpty() == false) {
            postorder(root);

        }
    }

    public void postorder(Node actual) {
        if (actual != null) {
            postorder(actual.getChildLeft());
            postorder(actual.getChildRight());
            System.out.println(actual.getElement() + ";");

        }
    }

    public void preorder() {
        if (isEmpty() == false) {
            preorder(root);
        }

    }

    public void preorder(Node actual) {
        if (actual != null) {
            System.out.println(actual.getElement() + ";");
            preorder(actual.getChildLeft());
            preorder(actual.getChildRight());

        }
    }
}
