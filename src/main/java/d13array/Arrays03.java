package d13array;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //Example 1: Create an int array and write the elements less than 5.
        //           [12, 3, -3, 5, 23] ==> 3, -3


        int[] numbers = {12, 3, -3, 5, 23};//Bu ifade, numbers isimli bir tamsayı dizisi oluşturur ve elemanlarını {12, 3, -3, 5, 23} olarak başlatır.

        System.out.println(Arrays.toString(numbers));//[12, 3, -3, 5, 23]


                              // [12, 3, -3, 5, 23]  dizi uzerinde dongu( for-each)

        for (int w : numbers) {    //Bu döngü, numbers dizisindeki her bir eleman için sırayla çalışır.
                                    //lk iterasyonda w değeri 12 olur, ikinci iterasyonda 3, üçüncü iterasyonda -3, dördüncü iterasyonda 5 ve beşinci iterasyonda 23.

            if (w < 5) {               //Eğer w değeri 5'ten küçükse, bu blok içindeki kod çalışır. Aksi takdirde, blok atlanır.

                System.out.print(w + ", "); // 3,-3
            }

        }


        //-------------------
        //Ornek 2: Spesifik bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz.
        //Example 2: Write the code to find out if a specific element is in Array

        //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir

         /*
        Yani, metot şu şekilde çalışır:
            Diziyi ikiye bölün.
            Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
            Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
            Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
            Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar
             tekrar edilir.
         */

        System.out.println("-----------------------");

         String names[] = {"A", "T" , "K", "E", "B" };

         Arrays.sort(names);                      // ilk yapacagimiz is siralama olacak

         System.out.println(Arrays.toString(names));//[A, B, E, K, T]


        int result = Arrays.binarySearch(names,"B");//mesela c istesek sonuc -3 cikar cunku bu harf yok ama normal sirayi veriri..yani olsaydi orda olurdu

        System.out.println(result);//1 indexi verdi



      //ARASTIRMA ODEVI: Java’da char veya boolean turunde bir array olusturabilir misiniz?


      //-------------------------


        int[] arr = {2,1,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 6, 7]


        // siaralan arr nin index lerini bulalim
        System.out.println(Arrays.binarySearch(arr,2));//1
        System.out.println(Arrays.binarySearch(arr,7));//3
        System.out.println(Arrays.binarySearch(arr,3));//-3
        System.out.println(Arrays.binarySearch(arr,9));//-5

      //---------------------------
        String[] str ={"A","B","C","D"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[A, B, C, D]



        System.out.println(Arrays.binarySearch(str,"A"));//0
        System.out.println(Arrays.binarySearch(str,"C"));//2
        System.out.println(Arrays.binarySearch(str,"E"));//-5
        System.out.println(Arrays.binarySearch(str,"G"));//-5 aradaki harflere bakma nerde olurdu ona bak

   //-------------------------------------

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //Example 3: Write the code that shows you how many words are in a given sentence.

        //String s = “Java is easy. Learn Java earn money.“;bir veriyi siz boldugunuzde coklu veri olusr


        String s = "Java is easy. Learn Java earn money.";
        System.out.println(s);

        String[] words= s.split(" ");// burda herbir cpaseden boler
        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length);//7






    }

}

