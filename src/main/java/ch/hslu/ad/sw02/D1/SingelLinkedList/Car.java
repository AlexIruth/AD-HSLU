/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw02.D1.SingelLinkedList;

import java.util.Objects;

/**
 * <p>
 * Car class.</p>
 *
 * @author alexi
 * @version $Id: $Id
 */
public class Car {

    private String brand;
    private int modelNummber;

    /**
     * <p>
     * Constructor for Car.</p>
     *
     * @param brand a {@link java.lang.String} object
     * @param modelNummber a int
     */
    public Car(String brand, int modelNummber) {
        this.brand = brand;
        this.modelNummber = modelNummber;
    }

    /**
     * <p>
     * Setter for the field <code>brand</code>.</p>
     *
     * @param brand a {@link java.lang.String} object
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * <p>
     * Setter for the field <code>modelNummber</code>.</p>
     *
     * @param modelNummber a int
     */
    public void setModelNummber(int modelNummber) {
        this.modelNummber = modelNummber;
    }

    /**
     * <p>
     * Getter for the field <code>brand</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getBrand() {
        return brand;
    }

    /**
     * <p>
     * Getter for the field <code>modelNummber</code>.</p>
     *
     * @return a int
     */
    public int getModelNummber() {
        return modelNummber;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", modelNummber=" + modelNummber + '}';
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Car) {
            return Integer.compare(modelNummber, ((Car) object).getModelNummber()) == 0;

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.brand);
        hash = 67 * hash + this.modelNummber;
        return hash;
    }

}
