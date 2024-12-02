package d11loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {


    /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.

    Example 2:  Create the code that prints the following figure to the console.

          X X X X X
          X X X X X
          X X X X X    */


       Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int row = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int column = input.nextInt();

        for (int i = 1; i <= row ; i++) {

            for (int k = 1; k <= column; k++) {
                System.out.print("X ");
            }
            System.out.println(); //ustteki print yanyana yazdirir. pointer'i bir alta aldik
            
        }

            /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.

            *
            * *
            * * *
            * * * *

         */


    // oncelikle kac satir olacagini belirleyelim
        int satirsayisi =4;

    // her satir icin bir dongu olusturalim

        for (int i = 1 ;  i <= satirsayisi ;   i++) {

         // i kadar * yazdir

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");

            }

         // her stirdan sonra yeni bir satira gec
            System.out.println();
        }


    }
}
