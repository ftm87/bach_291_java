package d14multidimensionalarrays_arraylist;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        //Ornek 1: Iki boyutlu bir Array’i tek boyutlu bir Array’e ceviriniz.
    //Example 1: Convert a two-dimensional Array to a one-dimensional Array.

           // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }



       //1.adim: Iki boyutlu bir Array’de kac eleman oldugunu bulan kodu yazalim

        int[][] numbers = {{5, 4}, {2, 3, 2}};


        int totalNumberOfElement=0;

      for (int[] w:numbers){
          totalNumberOfElement =totalNumberOfElement+w.length;

      }

       System.out.println(totalNumberOfElement);//5


        //2. adim tek boyutlu arrayi iki boyutlu arrayin eleman sayisini kullanarak olusturalim

        int[] newArr=new int[totalNumberOfElement];
        System.out.println(Arrays.toString(newArr));//[0, 0, 0, 0, 0]

       //3. adim :iki boyutlu Array daki elemanlari tek boyutlu Array e transfer edelim
                               // {{5, 4}, {2, 3, 2}}
       int idx =0;

       for (int[] w:numbers){ // burda iki boyutlu arrayi tek boyuta indirgiucez
           for (int k:w){
              newArr[idx] =k;
              idx++;
           }


       }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]

    }
}
