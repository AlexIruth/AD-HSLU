/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw04.D3.Hashtabelle;

/**
 *
 *
 * @author alexi
 * @version $Id: $Id
 */
public class Hashtabelle implements HashTabbelleInterface {

    private static final HashItem GRAVESTONE = new HashItem(null);
    private HashItem[] hashitems;
    private int usedSize;
    private final int size;

    public Hashtabelle(final int size) {
        this.size = size;
        hashitems = new HashItem[size];
        GRAVESTONE.setGraveStone(true);

    }

    @Override
    public boolean IsEmpty() {
        return usedSize <= 0;

    }

    @Override
    public boolean IsFull() {
        return usedSize >= size;

    }

    @Override
    public boolean add(Student element) {
        int index = Math.abs(element.hashCode() % this.size); // Normale Index berrechnung 
        while (HasNext(index)) {  // // Wenn der Normale Index schon besetzt ist, geht es durch die HasNext Methode mit einer while und erhöht so lange bis der Platz Frei ist.
            if (index > size) {// Reached End
                return false;

            }
            if (hashitems[index].getItem().equals(element)) {// duplicate not allowed
                return false;

            }
            index++;

        }

        hashitems[index] = new HashItem(element);
        usedSize++;
        return true;

    }

    @Override
    public boolean remove(Student element) {
        int index = Math.abs(element.hashCode() % size);
        do {
            if (hashitems[index].getItem().equals(element)) {
                hashitems[index] = GRAVESTONE;
                usedSize--;
                return true;
            }

            index++;

        } while (HasNext(index));

        return false;

    }

    @Override

    public boolean contains(Student element) {
        int index = Math.abs(element.hashCode() % this.size);
        while (HasNext(index)) {
            if (hashitems[index] != null && hashitems[index].getItem().equals(element)) {
                return true;

            }
            index++;

        }
        return false;

    }

    @Override
    public void clear() {
        hashitems = new HashItem[size];

    }

    public boolean HasNext(int index) {
        return index < size && hashitems[index] != null;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < size; index++) {
            if (hashitems[index] != null) {
                stringBuilder.append(hashitems[index]);

            } else {
                stringBuilder.append("[NULL]");
            }

        }
        return stringBuilder.toString();
    }
    
    
    

}
