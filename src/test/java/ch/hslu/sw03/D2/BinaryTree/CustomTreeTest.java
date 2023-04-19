/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw03.D2.BinaryTree;

import ch.hslu.ad.sw03.D2.BinaryTree.CustomTree;
import java.awt.font.TextAttribute;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexi
 */
public class CustomTreeTest {

    public CustomTreeTest() {
    }

    @Test
    public void testSearchRoot() {
        CustomTree customTree = new CustomTree();
        assertEquals(true, customTree.contains(5));
    }

    @Test
    public void testSearchLeaf() {
        CustomTree customTree = new CustomTree();
        assertEquals(false, customTree.contains(133));
    }

    @Test
    public void testSearch4() {
        CustomTree customTree = new CustomTree();
        assertEquals(true, customTree.contains(4));
    }

}
