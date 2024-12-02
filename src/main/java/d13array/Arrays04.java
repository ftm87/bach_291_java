package d13array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {


        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz(Interview Sorusu)
        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.

        //         [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr ={0,2,3,0,12,0};

        int[] newArr = new int[arr.length];// bos bir arry olusturduk

        System.out.println(Arrays.toString(arr));//[0, 2, 3, 0, 12, 0]

        System.out.println(Arrays.toString(newArr)); //[0, 0, 0, 0, 0, 0]

        int firstIndex = 0;  //index'lere yukleme yaptikca bunu 1 artiracagiz

                        //[0, 2, 3, 0, 12, 0]

        for (int w:arr){

            if (w!=0){
                newArr[firstIndex] = w;  //bos array'in ilk index'ine sifir olmayan sayiyi yukledik

                firstIndex++;

                //ilk index'e yukleme yapildigi icin, bir sonraki sifir harici sayi ilk index'e
                //yuklenmesin diye 1 artirdik
            }
        }

        System.out.println(Arrays.toString(newArr));//[2, 3, 12, 0, 0, 0]

       //-----------------------------------------
        //Arraylerin esit olup olmadigi nasil anlasilir?
        // Iki arrayin ayni olabilmesi icin,aynı uzunluğa sahip olmaları
        // ve ayni index te ayni elemanlarin bulunmasi gerekir

       int[] a =new  int[3];

        a[0] = 2;
        a[1] = 1;
        a[2] = 3;

        int[] b = new int[3];

        b[0] = 2;
        b[1] = 3;
        b[2] = 1;


        boolean result  =Arrays.equals(a,b);
        System.out.println("result="+result);//result=false cunku indexte ayni elem yok

    }
}
