/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw04.D3.Hashtabelle;

public class HashItem {

    private Student item;
    private boolean isGraveStone;

    public HashItem(Student item) {
        this.item = item;
        isGraveStone = false;

    }

    public Student getItem() {
        return item;

    }

    public boolean isGraveStone() {
        return isGraveStone;
    }

    public void setGraveStone(boolean graveStone) {
        isGraveStone = graveStone;
    }

    public String toString() {
        if (isGraveStone) {
            return "[Gravestone]";

        } else {
            return "[" + item.toString() + "]";
        }
    }
}
