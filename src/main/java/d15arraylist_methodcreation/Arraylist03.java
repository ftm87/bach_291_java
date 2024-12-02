package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist03 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.

        //                    [12, 23, 10, 19] ==> 12 ve 10


        List<Integer>  nums = new ArrayList<>();

        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        System.out.println(nums);//12, 23, 10, 19] once bunlari kucukten buyuge siralasak yani sort yapalim sonra bunlarin farkina bakalim

       // Collections.sort(nums); // bu siralama yapar kucukten buyuge diger koleksiyonlardada kullanilir
        nums.sort(null); // buda ayni isi yapar siralar.usteki ile ayni sadece ARRAYLISTLERDE KULLANILIRT

        System.out.println(nums);//[10, 12, 19, 23]

     //--------------------------------------

        int minDiff = nums.get(1)-nums.get(0);// burda get 1 ile 12 aldim get 0 ile 10 aldim.12-10=2 bu bizim kabulumuz .buna gore yapicz

        for (int i = 1; i < nums.size(); i++) { //  burda niye 1 den baslattik buyukten kucugu cikarmak icin

            minDiff= Math.min  (minDiff, nums.get(i) - nums.get(i-1));// mindiff=benim kabulum2 ,nums1. indeksten hep onu bir eksigini cikaricaz

        }

        System.out.println(minDiff);//2 min farki bulduk.

       //-----------------------------------
        // bu farki hangi iki sayidan
        // elde ettigimizi bullalim


        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i)-nums.get(i-1)==minDiff){

                System.out.println(nums.get(i)+ "ve"+ nums.get(i-1));

            }

        }






      //  ODEV   bu soru tek forla cozulebilrmiydi veya for each ile cozulebilrmiydi


    }
}
