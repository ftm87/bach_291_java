package d13array;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {


        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //  bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements


        // dizileri tanimlama ve basltama

        int[] ages1 = new int[6];// ifadesi, 6 elemanlı bir ages1 isimli tamsayı dizisi oluşturur.

        ages1[0] = 20; // ifadesi, ages1 dizisinin ilk elemanını 20 olarak ayarlar.


        int[] ages = new int[6];

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;         //ages[0]'dan ages[5]'e kadar olan ifadeler, ages dizisinin her bir elemanını sırasıyla 20, 23, 19, 44, 15 ve 32 olarak ayarlar.
        ages[3] = 44;
        ages[4] = 15;         //Arrays.toString(ages) ifadesi, ages dizisinin tüm elemanlarını içeren bir String (dizi) oluşturur.
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]


        //1. Yol.....diziyi siralama

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order’a gore siralar


        Arrays.sort(ages);                   // ifadesi, ages dizisini küçükten büyüğe doğru sıralar.

        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]

        System.out.println(ages[0] + ages[ages.length - 1]);//59   ifadesi, ages dizisinin ilk ve son elemanlarını toplar.*/

        //ages[0]:Bu ifade, ages dizisinin ilk elemanını temsil eder.
        //ages.length:
        //Bu ifade, ages dizisinin uzunluğunu (eleman sayısını) temsil eder.
        //ages dizisi 6 elemanlı olduğundan ages.length değeri 6 olur.
        //ages.length - 1:
        //Bu ifade, ages dizisinin son elemanının indeksini temsil eder.

        //Eğer ages dizisi sıralanmış haliyle [15, 19, 20, 23, 32, 44] ise, ages[5] değeri 44 olur.


        //-----------------------------------
        //2.Yol

        int minimum = ages[0];
        int maksimum = ages[0];

        //[20, 23, 19, 44, 15, 32]

        for (int w : ages) {

            minimum = Math.min(minimum, w);
            maksimum = Math.max(maksimum, w);

        }

        System.out.println(minimum);//15

        System.out.println(maksimum);//44

        System.out.println(minimum + maksimum);//59

    }
}
