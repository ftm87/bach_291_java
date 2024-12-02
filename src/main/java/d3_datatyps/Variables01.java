package d3_datatyps;

public class Variables01 {


    public static void main(String[] args) {

        //4- long data type:

        //Tam sayilar icindir. Hafizada 8 byte (64 bit) yer kaplar
        //-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.(kentilyon)

        //Not: Long olustururken eger deger, Integer'larin maximum degerinden buyuk ise
        //sonuna "L" koymak zorundasiniz, yoksa "Integer number too large - Tam sayı çok büyük hatasi alirsiniz.

        //Ornek 1: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Example 1: Create a variable for the number of cells in the human body and assign a value

        long numberOfCells = 123456789012L;
        System.out.println(numberOfCells); //123456789012

        //Ornek 2: Iki tane long variable olusturun ve toplamlarini bir etiketle console'a yazdirin.
        //Example 2: Create two Long variables and print their sums to the console with a label

        long c = 15, d = 20;
        System.out.println("Sum : " + (c + d)); //Sum : 35

        //---------------------

        //5- float data type: Hafizada 32 bit - 4 byte yer kaplar

        //(Decimal Numbers ==> ondalikli sayilar) icin kullanilir.
        //Ozellikle fiyat degerleri icin "float" kullanilir. App'inizde bu data tipini secmelisiniz.

        //Dikkat :Java ondalikli sayilari otomatik olarak double kabul eder.
        // (trigonometrik işlemler, logaritmalar vb.) çok hassas sonuçlar gerektiğinde,
        // double'ın daha yüksek hassasiyeti faydalı olabilir. O yuzden default double dir.
        //float olmasina israr ediyorsaniz sonuna "F" veya "f" koymalisiniz

        // Ornek 1: 2 tane float data tipinde variable olusturunuz ve bunlarin toplamini bir etiket ile console'a yazdiriniz.
        // Example 1: Create 2 float data type variables and write their sum to the console with a label.

        //1.yol:

        float sockPrice1 = 12.99f;
        float shirtprice1 = 25.99f;
        System.out.println("Total Price1: " + (sockPrice1 + shirtprice1));

        //2.yol

        float sockPrice2 = 12.99f, shirtPrice2 = 25.99f;
        System.out.println("Total Price2: " + (sockPrice2 + shirtPrice2));

        //3 corap, 2 gomlek olsaydi?
        //What if there were 3 socks and 2 shirts?
        System.out.println("Total Price: " + (3 * sockPrice1 + 2 * shirtPrice2));

        //6-double data type:

        // double memory de 8 byt (64) yer kaplar,ondalikli kisim icin daha fazla rakam alir.
        //Ondalikli sayilar icin kullanilir,daha hasasas hesaplamalar icin kullanilir

        //Ornek1; Hucre agirligi icin bir variabla olusturup konsola yazdiriniz.
        //Example; create a variable for cell weight and print it  to the consol

        double cellWeight=0.00000000000000000028;
        System.out.println(cellWeight);//2.8E-19==> 2.8 carpi 10 uzeri -19 demektir

        //------------------------------------

        //7- char 2 byte `tir (16bit). tek karakterler icin kullanilir.

        // Sayi ,sembol ,harf faketmez.Data tek tirnak icine yazilir
        // SD  seklinden iki karakter koyamazssiniz.
        // ornegin 'A', 'x', '?', 'S' koyabilirsiniz.


        //Ornek 1: char data tipinde bir variable olusturunuz ve icine isminizin ilk harfini yukleyiniz.
        //Example 1: Create a variable of char data type and insert the first letter of your name into it.

        char firstLetterOfTheName = 'S';
        System.out.println(firstLetterOfTheName); //S

        //8- Boolean Data Type: Sadece true (dogru) ve false (yanlis) olmak uzere 2 farkli deger alirlar.

        //Ornek 1: boolean data tipinde, emekli mi sorusu icin bir degisken olusturun ve false atayin.
        //Example 1: Create a variable of boolean data type for the question “Is he/she retired?” and assign it to false.

        boolean isRetired = false;
        System.out.println(isRetired);//false

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("--------------");
        System.out.println(b1 && b2 );//false
        System.out.println(b2 || b3); //true
        System.out.println(b2 && b4); //false
        System.out.println(b3 || b4); //true

        /*System.out.println() ve System.out.print() fonksiyonları arasındaki temel fark,
        System.out.println()'in bir satır atlayarak çıktı vermesi,
        System.out.print()'in ise aynı satırda çıktı vermeye devam etmesidir*/

        System.out.println("Hello");
        System.out.println("World");
        // Hello
        // World

        System.out.print("Hello ");
        System.out.print("World");

        // Hello World  ( kelimelerin arasinda bosluk olmasi icin ya sona bir bosluk yada vbasa bir bosluk koyariz.yoksa bitisik yazabilir

    }
}