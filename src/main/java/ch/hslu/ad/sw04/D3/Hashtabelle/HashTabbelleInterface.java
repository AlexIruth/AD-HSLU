/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.ad.sw04.D3.Hashtabelle;

  public interface HashTabbelleInterface {

    public boolean add(Student element); // Hinzufügen eines Elements 

    public boolean remove(Student element); // Entfernen eines Elements 

    public boolean contains(Student element); // Suchen eines Elements 

    public boolean IsEmpty(); // Abfrage ob es leer ist 

    public boolean IsFull(); // Abrage ob es voll ist 

    public void clear(); // Hashtabelle leeren 

    public int size();

    public String toString();

}
