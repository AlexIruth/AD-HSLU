/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.ad.sw02.D1.Stack;

/**
 * <p>Stack interface.</p>
 *
 * @author alexi

 * @version $Id: $Id
 */
public interface Stack {

    /**
     * Die push Methode fügt ein Element ein.
     *
     * @param element a {@link java.lang.String} object
     * @return a boolean
     */
    public boolean push(String element);

    /**
     * Die pop Funktion entfernt ein Element am Ende des Stacks. Um an das erste eingefügte Element zu kommen muss man
     * alle vorherige Elemente Enfernen.
     *
     * @return a {@link java.lang.String} object
     */
    public String pop();

    /**
     * Zeigt an wenn der Stack leer ist.
     *
     * @return a boolean
     */
    public boolean isEmpty();

    /**
     * Zeigt an wenn der Stack voll ist.
     *
     * @return a boolean
     */
    public boolean IsFull();

    /**
     * <p>size.</p>
     *
     * @return a int
     */
    public int size();

    /**
     * <p>peek.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String peek();

    /**
     * <p>getcurrentIndex.</p>
     *
     * @return a int
     */
    public int getcurrentIndex();

}
