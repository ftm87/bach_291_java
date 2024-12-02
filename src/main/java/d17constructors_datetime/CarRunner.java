package d17constructors_datetime;

public class CarRunner {


    public static void main(String[] args) {


        //4- Car class’indan bir object uretelim...aslinda kopyaladik

        //9- Default Car() icine parametre girelim

        Car c1 = new Car("BMW","3,20",2024,false); // bu objemiz

        System.out.println(c1.brand);// Honda arabamizi urettik simdi //BMW

        System.out.println(c1.model); //Accord //3.20

        System.out.println(c1.year);//2023   //2024

        System.out.println(c1.hybrid);// true  //false

        // simdi methodlara bakalim

        c1.action();   //Honda hizli hareket eder //BMW hizli hareket eder

        c1.stop();    //Hondaguvenli bir sekilde durur  //BMWguvenli bir sekilde durur

        // 5- Car classa gidip. constrakter olusturalim

        //10- Baska bir object uretelim ve direkt objeyi yazdiralim

        Car c2 = new  Car("Audi","A4",2018,false);
        System.out.println(c1);// reference alindi
        System.out.println(c2);// reference alindi


        //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim

        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //16- Yeni bir object uretelim

        Car c3 =new Car("Tofas","Sahin");
        System.out.println(c3);

    }


}
