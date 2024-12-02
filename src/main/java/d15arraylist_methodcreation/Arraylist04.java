package d15arraylist_methodcreation;

import java.util.Arrays;
import java.util.List;

public class Arraylist04 {
    public static void main(String[] args) {

        //Bir list olusturmak icin kisayol

        List<Integer> mylist = Arrays.asList (1,3,4,9,7);

        System.out.println(mylist);//[1, 3, 4, 9, 7]


        //1- Arrays.asList() ile oluşturulan liste, sabit boyutludur.

        // Array gibi calismaya baslar.

        // Bu, listenin boyutunu değiştiremezsiniz; yani yeni eleman ekleyemez veya çıkaramazsınız.

        //Listin eleman sayisini degistiren methodlari kullanamazsiniz.

        //2- Arrays.asList() ile oluşturulan liste, bazı liste işlemlerini desteklemez.

        // Örneğin, remove(), add(), clear() gibi yöntemler desteklenmez.

        // Ama set() veya size() kullanabilirsiniz

        //clear() metodu, bir listedeki tüm elemanları silmek için kullanılır.


       // mylist.remove(0);HATA // 0 indextekini sil demek

       //  mylist.add(5);HATA   .....en sona 5 ekle demek

       // mylist.clear();HATA......temizle

                        //[1, 3, 4, 9, 7]

        mylist.set(0,5); //  0 inci indexe 5 elemanini koy

        System.out.println(mylist);  //[5, 3, 4, 9, 7]  eleman degitiriyoruz sayisini degistirmiyoruz

        System.out.println(mylist.size());//5 eleleman sayisini ogrenmek istiyorum

        //Arraylit’lerin sagladigi bazi methodlari kullanmak istiyorsaniz ve

        // eleman sayisini degistirmeyecekseniz asList kullanabilirsiniz




    }
}
