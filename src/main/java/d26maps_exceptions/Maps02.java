package d26maps_exceptions;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String,Integer>stdAges=new HashMap<>();

        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        stdAges.put("Tom",35);
        System.out.println(stdAges);



        //1) replace() methodu, value'lari key'leri kullanarak update etmeye yarar
//Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
// kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

    stdAges.replace("Tom", 39);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}


        //2) replace() methodu, eski deger kontrolu yaparakta calisir


    stdAges.replace("Tom",21,45);// tom a git eski deger 21 ise 45 yap .ama degilse ayni devam etsin
        System.out.println(stdAges);

    stdAges.replace("Tom",39,45);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}--eski deger 39 oldugu icin degisiklik olacak


        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler.
        // Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.


       stdAges.putIfAbsent("Tom",77);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}---tom map te oldugu icin tom 77 eklemedi

        stdAges.putIfAbsent("Ayse",23);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18}--Ayae olmadigi icin eklenir


            //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
    //key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
    // bir varsayılan değer sağlama avantajına sahiptir.


        System.out.println(stdAges.get("Tom"));//45
        System.out.println(stdAges.getOrDefault("Tom",18));//45, Tom map te var buyuzden orjinal degerini verdi
        System.out.println(stdAges.get("Jeryy"));//null
        System.out.println(stdAges.getOrDefault("Jerry",18));//18--jerry mapte yk null donderiyor ona ne yuklerseniz onu verir

        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
    //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
    //Boolean return ederler{Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18}

       Boolean b =stdAges.containsValue(19);
        System.out.println(b);//true

        System.out.println(stdAges.containsKey("TOM"));//false
        System.out.println(stdAges.containsKey("Tom"));//true

   //-------------------------------------Buyuk kucuk harfe duyarsiz yapma

        Map<String,Integer> stdAges2 =new HashMap<>();

        stdAges2.put("Tom".toLowerCase(),25);
        System.out.println(stdAges2);//{tom=25}

        boolean b1 =stdAges2.containsKey("TOM".toLowerCase());
        System.out.println(b1);//true

        //---------------------------
        String emoji ="\uD83D\uDC9E" ;
        System.out.println(emoji);//😊.💞


       //------------------------------------

        //6)remove(); methodu key kullanarak entry silmeye yarar
        stdAges .remove("Tom");
        System.out.println(stdAges);//{Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18}, Tom ve value'su silindi

        stdAges.remove("Can",18);
        System.out.println(stdAges);

    }
}
