package d26maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {


        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)
        //ali = 2, nasilsin ALi =1

        String s = "Ali nasilsin Ali.";

        s =s.replaceAll("\\p{Punct}","").toLowerCase();// tum harfleri kucult ve noktalama isaretlerini sil
        System.out.println(s);//ali nasilsin ali

      String[] words =s.split(" ");
        System.out.println(Arrays.toString(words));//[ali, nasilsin, ali]

        HashMap<String,Integer>myMap =new HashMap<>();
        System.out.println(myMap);//{}
                                //[ali, nasilsin, ali]
        for (String w:words){

          Integer isThere = myMap.get(w);// ilk dongude w nun icinde ali var map te ali olmadigi icin null gelicek

        if (isThere==null){
            myMap.put(w,1);
        }else {
           myMap.put(w,isThere+1) ;// Mapte varsa onu bir arttir
        }

        }
        System.out.println(myMap);//{nasilsin=1, ali=2}


        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
//example2: Write the code that shows how many times each letter in a given String is used in that String.
//           "Hello" ==> H=1, e=1, l=2, o=1

    }
}
