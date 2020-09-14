package com.company;


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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
    Car Golf = new Car();
    human.addMyCar(Golf);/*
    System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
       */
        human.getSalary();

}
}
