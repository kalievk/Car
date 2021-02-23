package com.company;

public class Main {

    public static void main(String[] args) {

        Car[] car1 = new Car[3];
        car1[0] = new Car("Toyota", 2004, "blue", 9900);
        car1[1] = new Car("BMW", 2010, "gray", 12000);
        car1[2] = new Car("Subaru", 2008, "red", 9900);

        if (car1[0].year > 2003 && car1[0].price < 10000) {
                car1[0].info();
            }
        System.out.println();
        if (car1[1].year > 2003 && car1[1].price < 10000) {
                car1[1].info();
            }
        System.out.println();
        if (car1[2].year > 2003 && car1[2].price < 10000) {
                    car1[2].info();
        }
    }
}