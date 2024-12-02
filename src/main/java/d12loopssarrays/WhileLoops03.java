package d12loopssarrays;

public class WhileLoops03 {
    public static void main(String[] args) {


        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        // palindrom tersten de okunusu ayni olan
        //Example 1: Write the code to check if a given integer is a palindrome.

        //           Palindrome: 121 <==> 121        123321 <==> 123321



        int k =313; //bunu stringe cevirmeliyiz

        String original =String.valueOf(k); //"313" valuof tirnak yani string yapar

        String reversed = ""; // ters cevrilmis olani bunun icinde saklayacagiz.cunku strinde etkisiz hicliktir

        int index = original.length() -1; // son indexi aldik(yani benim leghtim 3 -1 =2 herzaman son indexi verir)

        while (index>=0) {  //index te 0 dada var onuda almak icin

        reversed= reversed + original.charAt(index) ;

        index--; //son indexten baslayip kucuge indik buyuzden --

        }

        System.out.println(reversed);//"313"

        if (original.equals(reversed)){ // simdi  burdan kontrol etmek icin if else kullnairiz
         System.out.println("Palindromdur");

        }else {
         System.out.println("polindrom degildir");

        }






    }
}
