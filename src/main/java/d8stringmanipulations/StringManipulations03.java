package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {


        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

    i)En az 8 karakter olsun
    ii)Space karakteri password'de olmasin
    iii)En az bir tane buyuk harf olsun
    iv)En az bir tane kucuk harf olsun
    v)En az bir tane rakam olsun */

    /*Example 1: Check the password entered by the user according to the following rules.

    i) At least 8 characters
    ii)Space character should not be in password
    iii) At least one capital letter
    iv) At least one lowercase letter
    v)At least one number */

        Scanner input= new Scanner(System.in);// Kullanıcıdan veri almak için Scanner nesnesi oluşturuyoruz

        System.out.println("Lutfen sifrenizi giriniz"); // Kullanıcıya bilgi veriyoruz, bir şifre girmesini istiyoruz
        String pwd=input.nextLine();  // Kullanıcının girdiği şifreyi alıyoruz ve bir String değişkene atıyoruz

       // NOT;

       // input.nextLine() metodu, kullanıcıdan tam bir satır (yani Enter tuşuna basılana kadar girilen tüm metni) alır.
        //  Kullanıcının girdiği bu metin, bir String (metin) olarak pwd isimli değişkene atanır.
          //  Burada String türünde bir değişken kullanıyoruz çünkü şifre gibi veriler genellikle metin şeklinde olur ve metinleri String türünde saklarız.

    //Şifre veya başka bir uzun metin alırken nextLine() kullanmak daha uygundur
        // çünkü kullanıcı boşluk (space) karakterleri de girebilir ve nextLine() bu boşlukları da alır.



        //i)En az 8 karakter olsun
        boolean lengthControl = pwd.length() > 7;// burda sifremin uzunlugunu kontrol edicem.buyuk kucuk bloone uretir.yani tru false

       // System.out.println("lengthControl = " + lengthControl);



        //ii)Space karakteri password'de olmasin

        // burda 3 secenek var hangisini kullanmak istersen
        //boolean spaceControl = pwd.replaceAll("[^ ]", "").length() == 0;// burda 0 yazmaktaki sebeb ben 0 tane space istiyorum demek,aciklamsi su bosluk haric hepsini sil"" sonra length ni aleger =0 ise tru
        //boolean spaceControl = pwd.replaceAll("[^ ]", "").isEmpty();....bu bosligu kontrol eder

        boolean spaceControl = !pwd.contains(" ");// contains iceriye bak bundan " " varmi demek.bosluk varsa true ama ben false uretmesini istiyorum bu yuzden basina ! koyariz
       // System.out.println("spaceControl = " + spaceControl);




       //iii) en az bir tane buyuk harf olsun

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length() > 0;// burda niye >0 dedik cunku ben en az 1 tane buyuk harf istiyroum anlaminda .bu yuzdeb =0 demedik bu istemiyorum anlaminda
       // System.out.println("upperCaseControl = " + upperCaseControl);

        if (!upperCaseControl){
            System.out.println("Sifre en az buyuyk bir harf icermelidir");
        }



        // iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        if (!lowerCaseControl){
            System.out.println("Sifre en az kucuk bir harf icermelidir");
        }


        //v)En az bir tane rakam olsun
        boolean digitControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        //System.out.println("digitControl = " + digitControl);


       if (!digitControl){
           System.out.println("Sifre en az bir rakam icermelidir");// altta yaptigimiz gbi kontrol ettik sifre gecersiz ise neden gecersiz oldugunu soylemek icin if
       }



        //ODEV: En az 1 tane sembol icermeli

    boolean sembol=!pwd.replaceAll("[^\\p{Punct}]","").isEmpty();


        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;// burda yaptigimiz sey tum girilen seyler dogrumu is valid?

         // burda bunu iki durumlu kontrol sistemei if lese ile kontrol ederiz

        if (isValid) {
            System.out.println("Sifre gecerlidir");
        } else {
            System.out.println("Sifre gecersizdir");
        }




    }
}
