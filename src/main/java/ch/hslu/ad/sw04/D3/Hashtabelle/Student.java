/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw04.D3.Hashtabelle;

import java.util.Objects;

/**
 *
 *
 * @author alexi
 * @version $Id: $Id
 */
public class Student {

    private final int id;
    private final String firstName;
    private final String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof final Student student)) {
            return false;
        }
        return (student.id == this.id);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " -> " + id;
    }

}
