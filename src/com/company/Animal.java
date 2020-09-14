package com.company;

public class Animal {

    String species;
    private Double weight;

    public Animal() { this.weight = 8.0;}
    void feed(){


        if(weight<18) {
            weight += 3;
            System.out.println("ulał się o 3 kg");

            System.out.println("My weight="+weight);
        }else{
            System.out.println("weź mnie wyprowadz bo zaraz zamiast psa bedzię świania");
        }
    }

    void takeForAWalk(){

        if(weight>0) {
            weight -= 3;
            System.out.println("odtyło mi sie 3 kg ");

            System.out.println("My weight="+weight);
        }else{
            System.out.println("ryju mordo chyba mi sie zdechło  ");
        }
    }


    }
