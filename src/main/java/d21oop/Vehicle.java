package d21oop;

public class Vehicle {

    /*Constructor Hiyerarsisi- Child class'tan bir object olusturdugunuzda constructor'lar
     en ustteki parent class'tan baslatilarak alta doğru calistirilir*/


    //Constracter olusturalim
    public Vehicle(){
        super();
        System.out.println("Honda,2023,Benzin");
    }

    public Vehicle(String marka, int yil ,String motor){
        super();
        System.out.println("Honda ,2024,Elektrikli");
    }


}
