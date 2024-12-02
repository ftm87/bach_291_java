package d17constructors_datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {


        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.

        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.


        Scanner input = new Scanner(System.in) ;

        LocalDate givenDate=null ;//LocalDate givenDate de yazabiliriz.burda bos baslattim birazdan burasi dolabilr

        while (true){
            System.out.println("Lutfen  yili giriniz");

            int year = input.nextInt();

            System.out.println("Lutfen ayi griniz");

            int month = input.nextInt();

            if (month<1 || month>12){
                System.out.println("Ay 1-12 arasinda olmalidir tekrar deneyiniz");
             continue;// kullaniciyi dongunun basina yonlendirir
            }
            System.out.println("Lutfen gunu giriniz");
            int day = input.nextInt();

            //Ayin kac cektigini bulalim.Yil ve ay icin YearMounth objesi olusturalim
            YearMonth yearMonth =YearMonth.of(year,month);

            //Ayin maximum gun sayisini bulalim
           int daysInMonth =yearMonth.lengthOfMonth();

            if(day<1 || day>daysInMonth) {
                System.out.println("Girilen ay icin gecersiz gun.tekrar deneyiniz");
            continue;
            }
          givenDate=LocalDate.of(year,month,day);
            if (givenDate.isBefore(LocalDate.now())){
                System.out.println("Gecersizgecmis bir tarih girdiniz.tekrar deneyiniz");

            }else {
                System.out.println("Zamani giriniz");
                break;
            }
        }


        //break'te buradaki kodlar calisir
//return icinde bulundugu metodu sonlandirir. Burada main metodu sonlandirir ve
//programin calismasi duru

    }
}
