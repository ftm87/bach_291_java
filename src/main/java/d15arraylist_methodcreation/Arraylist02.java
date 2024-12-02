package d15arraylist_methodcreation;

import java.util.ArrayList;

public class Arraylist02 {

    public static void main(String[] args) {



        //Ornek 1:  Bir String ArrayList oluşturun ve “a” içeren elemanlari silin.

    //Example 1: Create a String ArrayList and delete the elements containing “a”.


        ArrayList<String> r =new ArrayList<>();

        r.add("Manisa");
        r.add("Nigde");
        r.add("tokat");
        r.add("Van");
        System.out.println(r);//[Manisa, Nigde, tokat, Van]


     /*  for (String w : r) {

            if (w.contains("a")) {

                r.remove(w);   // bu silme islemini yapar
            }

        }
        System.out.println(r);  HATALI     */




          /*for each kullandiginizda list'lerde eleman sayisini azaltamazsiniz.

        Cunku "for each" döngüsü ile bir koleksiyonu veya diziyi dolaşırken, koleksiyonun veya dizinin
        boyutu değişirse, bu, döngünün tutarlılığını bozar. Özellikle, eleman kaldırıldığında, döngü hâlâ
        eski boyutu dikkate alacak, bu da dizi sınırlarını aşabilir veya yanlış elemanlara erişebilir.
        Ayrıca, diğer elemanların dizin numaraları değişecektir, bu da yanıltıcı sonuçlara yol açabilir.

        Concurrent Modification Exception - Eşzamanlı Değişiklik İstisnası olusur.
        Yani bir dongu sayisi for each tarafindan ornegin 4 olarak ayarlanmissa,
        siz bir elemani silince o 4 uzerinden devam etmeye calisacagi icin tutarsizlik olusur */


        // [Manisa, Nigde, tokat, Van]  Başlangıçta bir ArrayList içinde şehir isimleri var:


        for (int i = 0; i < r.size(); i++) {     //Bu for döngüsü, listenin elemanlarını teker teker kontrol etmek için kullanılıyor. i değişkeni, listenin indeksini temsil ediyor ve i başlangıçta 0'dan başlıyor.

                 if (r.get(i).contains("a")) {
                  r.remove(i);

                   i--;// burda bir azalt bir attir yapmaliyiz.index silindikce yeni inex atanir
                 }

        }
        System.out.println(r);

   //ODEV: Bu soruyu i'yi son index'ten baslatarak ta cozebilirdik.i-- yazmaya gerek kalmazdi. Nasil?

        /*  r.get(i): Listenin i indeksindeki elemanını alır.
        contains("a"): Elemanın içinde "a" harfi olup olmadığını kontrol eder.
        Eğer elemanın içinde "a" harfi varsa (if koşulu doğruysa), r.remove(i) ile bu eleman listeden kaldırılır.*/

        for (int i = r.size(); i >0; i--) {
            if(r.get(i).contains("a")){
                r.remove(i);

            }
        }
        System.out.println(r);
    }
}
