package d21oop;

import d20staticblock_instanceblock_oop.Vehicle;

public class Car extends Vehicle {

    public String model = "Accord";
    public int year = 2024;

    public Car() {
        this("Sport");
        System.out.println("Sedan");
    }
    public Car(String tip){ //3
        super();
        System.out.println("Sport");
    }

}
