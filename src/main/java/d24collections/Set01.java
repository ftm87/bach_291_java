package d24collections;

import java.util.*;

public class Set01 {
    public static void main(String[] args) {

        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no


           /*Java'da üç tür set vardır:
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null'i eleman olarak kabul ederler */

        //-------------------------ek bilgi
        //Hash Code gormek istersek(verilerin daha hizli gormemizi saglar)

        String a = "Aliye can";
        System.out.println(a.hashCode());// veriyi degistirdikce baska kod veriri .hashcode benzersiz degildir bazen aynisi gelebilir.

        /*2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
    bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
    LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
    Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

    Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

    3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
    HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
    Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
    Bu nedenle, TreeSet bir Sorted Set'tir.*/

        //-----------------------------
        HashSet<String> hs = new HashSet<>();
        System.out.println(hs);//[]

        //HashSet’e nasil eleman eklenir?

        hs.add("fatma");
        hs.add("adem");
        hs.add("numan");
        hs.add("elif");
        System.out.println(hs);//[fatma, adem, numan, elif] karisk da tutar normalde duzenlide olabilir

        hs.add("fatma");
        System.out.println(hs);//[fatma, adem, numan, elif] tekrarli eeman hata vermez uxerin yazr


        hs.add(null);
        System.out.println(hs);//[null, fatma, adem, numan, elif]

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);//[14, 19, 7, 1, null]-insertion order - ekleme sirasina gore siralama

        LinkedHashSet<Integer> lh = new LinkedHashSet<>();

        lh.add(14);
        lh.add(19);
        lh.add(17);
        lh.add(11);
        System.out.println(lh);

        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.


        lhs.retainAll(lh);
        System.out.println(lhs);//[14, 19]
        System.out.println(lh);//[14, 19, 17, 11]

        //------------------------

        //TreeSet nasil olusturulur?

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null);hata ,null koyamazssiniz cunku null in dogal siralamsi yoktur
        System.out.println(ts);//[A, G, R, U, Z]-natural order-A--Z


        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        SortedSet<Character> ss = ts.subSet('G', 'U');
        System.out.println(ss);//[G, R] birinci dahil ikinci degil (subsitring gbi)

    }
}
