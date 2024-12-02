package d12loopssarrays;

import java.util.Random;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

       int rastgelesayi= rand.nextInt(20,100);
       int denemeSayisi =0;
       int tahminEdilen;
       boolean tahminDogrumu=false;

        System.out.println("Lutfen 20 ile 100 arasinda bir sayiyi tahmin etmeye calisiniz");

        do {
            System.out.println("Tahmininizi yapiniz");
            tahminEdilen=input.nextInt();
            denemeSayisi++;

            if (tahminEdilen<rastgelesayi){
                System.out.println("Sayi daha buyuk");
            } else if (tahminEdilen>rastgelesayi) {
                System.out.println("Sayi daha kucuk");
            }else {
                tahminDogrumu=true;
                System.out.println("Tebrikler bildiniz");
                System.out.println("Deneme sayisi:"+denemeSayisi);
            }


        }while (!tahminDogrumu);
        input.close();






    }
}
