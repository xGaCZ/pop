package com.company;


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
    human.addMyCar(Golf);
}
}
