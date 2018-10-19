/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author fede
 */
public class Car {
    private String      id;
    private String      brand;
    private int         year;
    private String      Color;
    private int         price;
    private boolean     soldState;

    public Car(String id, String brand, int year, String Color, int price, boolean soldState) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.Color = Color;
        this.price = price;
        this.soldState = soldState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSoldState() {
        return soldState;
    }

    public void setSoldState(boolean soldState) {
        this.soldState = soldState;
    }
    
}
