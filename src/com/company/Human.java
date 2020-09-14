package com.company;
import devices.Car;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Human {
    Animal pet;
   private Car mycar;
    Double salary=250.0;

    public String toString(){
        return pet+" "+mycar+"  "+salary;
    }

    void addMyCar(Car car) {
        this.mycar = car; }

    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("sinako musi byc na +");
        } else {
            System.out.println("wypisuje informacje o tym, że nowe dane zostały wysłane do systemu księgowego ");
            System.out.println("wypisuje informację o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("wypisuje info, że ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu ");

            return salary;
        }
        return salary;
    }

    public Animal getPet() {
        return pet;
    }

    public void setMyCar(Car myCar) {
        if(salary>=myCar.price) {
            System.out.println("nowa furka jest posiadana !");
            addMyCar(myCar);
        }else if (salary>(myCar.price/12)){
            System.out.println("na kreche możesz kupić");
            addMyCar(myCar);
        }else {
            System.out.println("idz być biedakiem gdzie indziej ");
        }
    }

    public Double getSalary() {
            System.out.println( " Data " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME) +" Siano " + salary);
        return salary;








}
}
