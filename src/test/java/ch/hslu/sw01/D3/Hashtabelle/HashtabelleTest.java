/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw01.D3.Hashtabelle;

import ch.hslu.ad.sw04.D3.Hashtabelle.Hashtabelle;
import ch.hslu.ad.sw04.D3.Hashtabelle.Student;
import org.assertj.core.error.ShouldContainExactly;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author alexi
 */
public class HashtabelleTest {

    Student element1 = new Student(23, "Alex", "Iruth");
    Student element2 = new Student(26, "Daniel", "Bucher");
    Student element3 = new Student(288, "Marti", "Kausch");

    @Test
    public void testIfFull() {
        Hashtabelle hashtabelle = new Hashtabelle(4);
        hashtabelle.add(element1);
        hashtabelle.add(element2);
        hashtabelle.add(element3);
        Assertions.assertEquals(false, hashtabelle.IsFull());

    }

    @Test
    public void testIfFull2() {
        Hashtabelle hashtabelle = new Hashtabelle(3);
        hashtabelle.add(element1);
        hashtabelle.add(element2);
        hashtabelle.add(element3);
        Assertions.assertEquals(true, hashtabelle.IsFull());

    }

    @Test
    public void testIsEmpty() {
        Hashtabelle hashtabelle = new Hashtabelle(4);
        Assertions.assertEquals(true, hashtabelle.IsEmpty());

    }

    @Test
    public void testSameHashCode() {
        Hashtabelle hashtabelle = new Hashtabelle(10);
        Student element4 = new Student(23, "Alexrg", "Irutwh");
        Student element5 = new Student(23, "Alex", "Iruth");
        hashtabelle.add(element4);
        Assertions.assertFalse(hashtabelle.add(element5));

    }

    @Test
    public void testequals() {
        Hashtabelle hashtabelle = new Hashtabelle(2);
        Student element4 = new Student(23, "Alex", "Iruth");
        Student element5 = new Student(23, "Alex", "Iruth");
        hashtabelle.add(element4);
        hashtabelle.add(element5);

    }

    @Test
    public void testGraveStone() {
        Hashtabelle hashtabelle = new Hashtabelle(2);
        Student element4 = new Student(22, "Alex", "Iruth");
        hashtabelle.add(element4);
      

        // Fehlt  Fragen wie man das Testet mit bezüglich ToString 
    }

}
