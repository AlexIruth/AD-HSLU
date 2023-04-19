/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw04.D3.Hashtabelle;

/**
 *
 * @author alexi
 */
public class Demo {

    public static void main(String[] args) {
        Hashtabelle hashtabelle = new Hashtabelle(10);
        Student element1 = new Student(5, "Alex", "Iruth");
        Student element2 = new Student(8, "Ron", "Weasly");
        Student element3 = new Student(90, "Harry", "Potter");
        Student element4 = new Student(10, "Lord", "Volldemort");
        hashtabelle.add(element1); //3
        hashtabelle.add(element2); //8
        hashtabelle.add(element3);//0
        hashtabelle.add(element4);//Eigentlich 0 durch Kollision 1 
        System.out.println(hashtabelle.toString());
        hashtabelle.remove(element3);
        System.out.println(hashtabelle.toString());
    }

}
