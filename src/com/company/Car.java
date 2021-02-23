package com.company;

public class Car {
    public String model;
    public int year;
    public String color;
    public double price;

    public Car(String model, int year, String color, double price) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void info(){
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + price);
        System.out.println("Цвет: " + color);
        System.out.println("Год выпуска: " + year);
    }
}
