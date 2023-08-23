package org.example;

public class Main {
    public static void main(String[] args) {
        wagCarFactory wagCarFactory=new wagCarFactory();
        wagCar seat=wagCarFactory.createSeatLeon();
        wagCar golf=wagCarFactory.createVwGolf();
        wagCar a3=wagCarFactory.createAudiA3();
        System.out.println(seat);
        System.out.println(golf);
        System.out.println(a3);
        System.out.println("Hello world!");
    }
}