package d3_datatyps;

public class Variables02 {
    public static void main(String[] args) {

        /*
        Non -primitive Data Types ;

        Ornegin String   class non -primitive bir data type dir

        Not 1: Uretilen her bir class ayni zamanda  bir  "non - primitive"   data typededir
        Buyuzden " non - primitive " data type lar sinirsiz sayidadir denilebilir

        Not2 : Non - primitive  data type lerin isimleri buyuk harfle baslar

        Not 3: Non - primitive ler icin  Java memoryde  buyuklugune gore degisen boyutlarda  yer ayirir
         */

       // String Data tipi ( Class) :String data tipi ,cumleler , kelimeler, semboller ,rakamlar icerebilir.
       // burda cift tirnak onemlidir ""

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak  Ali  Can  atayiniz.
        //Example1: Create a variable for the student name  and  assing  the volue to Ali Can .


        String studentName = "Ali Can";


        //-----------------------
        /*
        Soru: primitive ve non-primitive data type’lari arasindaki farklar nelerdir? (İnterview sorusu)

        1) "primitive" ler sadece bizim atadigimiz degeri icerir
            "non-primitive" ler bizim atadigimiz degeri ve methodlari icerir
        2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
        3) "primitive" leri Java uretmistir ve 8 tanedir
           "non-primitive" leri Java ve kod yazanlar uretebilir, sinirsiz sayidadir.
        4) "primitive" ler memory’de data type’larina gore sabit boyutta bellek kullanir
           "non-primitive" ler icin Java memory’de buyuklugune gore degisen boyutlarda bellek kullanabilir
        */
        //-----------------------

        //Ornek 2:Sehir ismi icin bir variable olusturun ve once "Ankara" sonra da "Izmir" degerlerini atayip ekrana yazdirin.
        //Example 2: Create a variable for the city name and assign the values "Ankara" and then "Izmir" and print it on the screen.

       String ctyName ="Ankara";
        System.out.println(ctyName);

        ctyName ="Izmir";
        System.out.println(ctyName);

    // Not .: yukardaki ornekte data tipi yazmazssak konsolo ayri ayri ayazar.fakat ikinci ornege data tipi string yazssa idik hata  veryor.cunku yasam alaninda iki data tipi ayni olamaz
      // Java yukardan asagi soldan saga dogru calisir


    }
}
