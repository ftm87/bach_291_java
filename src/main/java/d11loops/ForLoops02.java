package d11loops;

public class ForLoops02 {
    public static void main(String[] args) {


       //ornek 1: 6'dan 10'a kadar tum int’lerin toplamini console’a yazdiriniz.

     //example 1: Write the sum of all int’s from 6 to 10 to the console

                //      6+7+8+9+10=40 ==> 40

        int sum = 0;            // bos alan olusturmak... 0 etkisiz eleman onunla baslariz.6 yi dongude kullanicaz

        for (int i = 6; i <11 ; i++) {

            sum = sum +i;

        }
        System.out.println(sum);


    //-------------------------------


        //ornek 2: 10'dan 7'e kadar tum int’lerin carpimini console’a yazdiriniz.

        //example 2: Write the product of all int’s from 10 to 7 to the console

                  //      10x9x8x7 ==> 5040


        int sum1 =1;

        for (int i = 10; i >=7 ; i--) {

            sum1 = sum1 * i;

        }

        System.out.println(sum1);


    }
}
