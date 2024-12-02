package d11loops;

public class ForLoops01 {

    public static void main(String[] args) {

        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.(interviuv sorusu)
        //example 1: Print the sum of the digits of a given integer to the console
        //
        //           578 ==> 5+7+8=20 ==> Output 20 olmali



        int sum=0;  // (0-8-15-20  memory de bos bir alan olusturalim  bunun icine koyacagiz.toplamada etkisiz eleman oldugu icin 0 aliyoruz


        for (int i = 578; i >0 ; i/=10) {

             sum =sum +i%10;
        }                                                         // i /=10    dongum 578 ile basladi asagi dogru

        System.out.println(sum);



        //----------------------------------------
        System.out.println("-------------------------");

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.

        //Example 2: Write the code that returns the non-repeating characters in a String.

                                       // Yusuf ==> Ysf


        String t = " Yusuf";
        String unique = "";    //Y - s - f              stringte etkisiz eleman hicliktir.bos bir alan olusturduk ysf yi burda sakliycaz

        for (int i = 0; i < t.length(); i++) {     // indexler 0 dan baslarve dinamik olsun diye t.length yzariz

            char ch = t.charAt(i); //index verdik, bize harfi verecek

            if (t.indexOf(ch) == t.lastIndexOf(ch)) { // estse tekrarsizdir
                unique = unique + ch;


            }

        }

        System.out.println("tekrarsiz :" + unique);


    }

}