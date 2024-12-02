package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime01 {
    public static void main(String[] args) {

/*LocalTime Class'ta kullanilan tarih saat formatlari

    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
    hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
    HH : mm : ss ==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */


    //-------------

        //ornek 1:“DateTimeFormatter”, bir Class’tir ve tarih ve saat verilerini belirli bir
    // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.
    //DateTimeFormatter, tarih ve saat nesnelerini “metin” yani String olarak biçimlendirmenize ve
    // metni tarih ve saat nesnelerine çözmenize olanak tanır.

        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini

        // biçimlendirmek için kullanılır.

        //format() method’u LocalTime’i String’e istedigimiz formatta cevirir

        LocalTime myCurrentTime=LocalTime.now();

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm:ss ");

        String formattedTime=dtf1.format(myCurrentTime);
        System.out.println(formattedTime);//10:15 AM


        //---------------------------------
        // Ornek 2:Tarihi formatlayalim

        LocalDate myCurrentDate =LocalDate.now();
        System.out.println(myCurrentDate);//2024-10-04

        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("dd-MMM-yyy");// bu benim kalibim istedigim gibi duzenlerim
        String formattedDate=dtf2.format(myCurrentDate);
        System.out.println(formattedDate);//04-Oct-2024

     //----------------------------

        //ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
    // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar


   // Tokyada ayin kaci?

        LocalDate dateInTokyo =LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2024-10-04//  ARASTIRMA ODEVI; Java bu bilgiyi internettenmi cekiyor..


      //Amsterdamda ayin kaci?
        LocalDate dateInAmsterdam =LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2024-10-04

        //Tokyoda saat kac?

        LocalTime timeInTokyo =LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(timeInTokyo);//17:36:00.496105300


        // Tum zone leri gorelim
/*
        Set<String>zoneIds= ZoneId.getAvailableZoneIds();

    for (String w: zoneIds){
        System.out.println(w);
    }
    // zaman dilimlerinin sayisini gorelim

        System.out.println("Toplam zamn dilimi sayisi:"+ zoneIds.size());*/
//-------------------------------------------------------

    // Tarih ile zamani ayni anda kullanalim

    //ornek 4: Tarih ve zamani ayni anda kullanalim.
        // LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.


    LocalDateTime ldt =LocalDateTime.now();
        System.out.println(ldt);//2024-10-04T10:46:52.756926800



    DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("dd *MMM *yyyy -hh :mm a") ;

   String formattedLdt =dtf3.format(ldt);
        System.out.println(formattedLdt);//04 *Oct *2024 -10 :50 AM



    }
}
