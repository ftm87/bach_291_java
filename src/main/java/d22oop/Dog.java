package d22oop;

import d21oop.Animal;
import d21oop.Mammal;

public class Dog extends Mammal {

    public void bark() {
        System.out.println("Dogs bark...");

    }

    @Override
    public void eat() {
        System.out.println("Dogs eat...");
    }

   @Override

   public Animal create() {
       return new Dog();//upcasting - Java bunu otomatik yapar
       //Dog class'tan bir object urettik ve disari
       //Animal data tipiyle return ettim
       //Downcasting-otomotik yapilmaz biz yapariz
   }

   @Override
   public int add(int a,int b){
       return a+b;
       //primitive data tipleri arasinda parent-child iliskisi yoktur
       //primitive data tipleri arasinda parent-child iliskisi yoktur
     //primitive'lerde return type degistirilemez

    }

    @Override
    public Integer mltiply(Integer a, Integer b) {
        return a*b;


    }


    }
