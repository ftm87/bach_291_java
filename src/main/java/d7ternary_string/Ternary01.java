package d7ternary_string;

public class Ternary01 {
    public static void main(String[] args) {


    //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

    //Example 1: Write the code that calculates the absolute value of a number.

    //-4 ==> -1*-4, 4 ==> 4, 0 ==> 0

    //Bir gerçek sayının sayı doğrusundaki yerinin başlangıç noktasına (sıfıra) olan uzaklığına
    // o sayının mutlak değeri denir. Sifirin mutlak degeri de sifirdir.


        //(c)? (t) :(f)//if-else yapısının kısa bir alternatifidir ve genellikle basit koşullu atamalar veya ifadeler için kullanılır. Java'da ternary operatörünü kullanarak belirli bir değeri kontrol edip buna göre bir işlem yapabilirsiniz.

      int c =4;
                 // conndition ? tru : false;

         int result =   c<0    ? -1*c  : c;

            System.out.println(result);

        //-----------------------------------
         //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
    // “Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.
    //Example 2: If the signs of two numbers are the same, multiply these numbers, if the signs are different
    // Write the code that gives the message “I cannot multiply numbers with different signs”.

    int a=7;
    int b =-4;            //    (conditon)                    ?  (true)  : (false)

       Object result1 = (a > 0 && b > 0) || (a < 0 && b < 0) ? (a * b) : ("Farkli isaretli sayilari carpamiyorum");

        System.out.println(result1);
    }
}
   // burda objec yamak zorundayiz cunku int ve string ikisinide kabul etmiyor ama object ikisinde var
  //Ternary operatörün her iki sonucunun farklı türlerde olması durumunda, Java bu türleri birleştirmek için Object türünü kullanır.
// Bu sayede, farklı türdeki değerler Object türü altında tutulabilir ve
// bu tür, tüm nesnelerin ortak üst sınıfı olduğu için her iki sonucu da kapsayabilir.