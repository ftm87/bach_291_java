package d28exception_enum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        //Cities c = new Cities();hata
        //1- Enum daki bir sabite nasil ulasabiliriz?

      Cities il = Cities.AKSARAY;
        System.out.println(il);//AKSARAY

        //2- BURSA sabitinin ismine ulasalim

       String ilIsmi =Cities.BURSA.getCityName();
        System.out.println(ilIsmi);

       //3- Ankara’nin posta koduna ulasalim

       String pstaKod =Cities.ANKARA.getPostalCode();
        System.out.println(pstaKod);//06000

        //4- Antalya’nin plaka koduna ulasalim

        int kod=Cities.ANTALYA.getPlateCode();
        System.out.println(kod);

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //values() methodu enum icindeki tum datalari bir Array icinde bize verir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen plaka kodu giriniz");
        int plaka =scan.nextInt();

       Cities[] sehirler = Cities.values();
       // System.out.println(Arrays.toString(sehirler));

        if (plaka<1 || plaka>81){
            System.out.println("Lutfen 1 ile 81 arasi bir plaka giriniz");

        }else {

           for (Cities w:sehirler){
               if (plaka== w.getPlateCode()){
                   System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
                   break;
               }
           }

        }

    }
}
