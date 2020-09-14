package com.company;


import devices.Car;
import devices.Device;

public class Main {

    public static void main(String[] args) {
        Animal Animal = new Animal();
        Animal.feed();
        Animal.takeForAWalk();
        Animal.takeForAWalk();
        Animal.takeForAWalk();
        Animal.feed();
        Animal.feed();
        Animal.feed();

    Human human = new Human();
    Car golf = new Car();
    human.addMyCar(golf);/*
    System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
       */
        Car pasat = new Car();
        pasat.setColor("rudy");
        pasat.setModel("B5");
        pasat.setPrice(2745.0);
        pasat.setProducer("Pasat starego SA.");

        Car golfica = new Car();
        golf.setColor("butelkowa zielen ");
        golf.setModel("mk3");
        golf.setPrice(999.0);
        golf.setProducer("golfica kurwica coropration");



        Car seat = new Car();
        seat.setColor("blue");
        seat.setModel("ibiza");
        seat.setPrice(555.0);
        seat.setProducer("SEAT ");

        System.out.println("............................");
        human.getSalary();
        System.out.println("...........................");
        System.out.println(seat.toString());
        System.out.println("...........................");
        System.out.println("-----------------------------");


        human.setMyCar(pasat);

        Device device = new Device() {
            public boolean turnOn() {
                System.out.println("Turn On");
                return true;
            }
        };

        device.turnOn();
        human.setMyCar(seat);
        human.setMyCar(golfica);
        human.setMyCar(pasat);
        human.addMyCar(seat);
}
}
