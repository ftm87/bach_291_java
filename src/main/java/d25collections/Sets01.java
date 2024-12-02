package d25collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

        //Interview Sorusu
    //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
    //Interview Question
    //Example 1 : Store student email addresses in natural order.

        // not; burda set kullanacagimiz nerden anlariz cunku kimlik no ve mailler benzersizdir.natural sirala dedigi icinde treeset kullanmaliiz

        long t1 = System.nanoTime();// bu bir kronometre gibi calisir yani 1 yol ne kadar surecek gibi anlaminda

    //1-yol :Yavas - her adimda siralama yapar

        TreeSet<String> emails =new TreeSet<>();

        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("l@gmail.com");
        emails.add("c@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, x@gmail.com]


        //TreeSet'ler cok yavas, biraz hizlandirabilir miyiz?
        //Elemanlari eklerken en hizli olandan (HashSet) yardim alalim.

        long t2 =System.nanoTime();
        //2. yol: Daha hizli--tavsiye edilir

        HashSet<String>emailsHs =new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("c@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");
        System.out.println(emailsHs);// burda sirali yazdirmaz
       //[b@gmail.com, k@gmail.com, g@gmail.com, t@gmail.com, c@gmail.com, x@gmail.com, p@gmail.com, u@gmail.com, a@gmail.com, l@gmail.com]

        //Bos bir TreeSet olusturalim ve constructor'ina HashSet'i yazalim

       TreeSet<String>emailsHsTs =new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);//[a@gmail.com, b@gmail.com, c@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, x@gmail.com]

        long t3 =System.nanoTime();

        System.out.println(t2-t1);//Treeset-362400
        System.out.println(t3-t2);//Hashset-126000 (daha hizli)


    }
}
