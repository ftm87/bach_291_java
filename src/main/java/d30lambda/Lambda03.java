package d30lambda;

import java.util.*;

public class Lambda03 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10,14));

        // printCubeOfDistinctOddElements(nums);
        //printSumOfSquaresOfDistinctEvenElements(nums);
        //printProductOfSquareOfDistinctEvenElements(nums);
        //maksimum1(nums);
        //maksimum2(nums);
        //maksimum3(nums);
        //maksimum4(nums);
        //minimum1(nums);
        // minimum2(nums);
        // maksimum3(nums);
       // minimum4(nums);
        getMinGreaterThanSevenEven(nums);
    }


    //3) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //3) Create a method that prints the cubes of odd numbers in a list of integers,
    // without repeating, on the same line, with spaces between them. (Functional)

    //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir


    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

       nums.
               stream().              // akis basladi
               distinct().            // tekraralari kaldir
               filter(t-> t % 2 !=0). //kontrol et tek sayilari
               map(t-> t*t*t).        // akistan gelen tek sayilari kup olarak yaz
               forEach(t-> System.out.println(t+" ")); // yazir

    }

    //----------------------------------

    //4)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
    //4)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

    //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.3+5=8

        //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
        //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
        //u: Ilk elemandir
        //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.


    //İlk iterasyonda:
    //t=0 (başlangıç değeri olarak belirtildiği için)
    //u=4 (ilk eleman)
    //t+u = 4

    //İkinci iterasyonda:
    //t=4 (önceki adımdan gelen sonuç)
    //u=100 (ikinci eleman)
    //t+u = 104

    /*Java'da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*/

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        int toplam = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, Integer::sum);

        System.out.println(toplam);//104

    }

    //--------------------------------
    //5) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan bir method oluşturunuz.
    //5) Create a method that calculates the product of the squares of all non-repeating even numbers in a list.

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums) {
        int carpma = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(carpma);//64
    }

    //----------------------------------
    //6)Verilen List'teki maksimum değeri bulmak için bir method oluşturun.
    //6)Create a method to find the maximum value in the given List

    //1.yol

    //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)


    public static void maksimum1(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);// max bulmak icin min almak gerekli
        System.out.println(max);//11
    }

    //2.yol

    public static void maksimum2(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t, u) -> t > u ? t : u); // burda ilk indextekini max kabul edip na gore siraladi
        System.out.println(max);//11
    }

    //3.yol
    public static void maksimum3(List<Integer> nums) {
        //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)

        Integer max = nums.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> u).get();// tek parametlilerde get kullan
        System.out.println(max);
    }

    //4.yol-best praktis

    public static void maksimum4(List<Integer> nums) {

        //Java'da :: işareti, "Method Reference" olarak adlandırılır.
        // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.
        Integer max = nums.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }


    //-------------------------------

    //7)Verilen List’teki minimum değeri bulmak için bir method oluşturun.
    //7)Create a method to find the minimum value in the given List

    //1.yol

    public static void minimum1(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                reduce((t,u)-> Math.min(t,u)).
                get();
        System.out.println(min);//2
    }

    //2.yol
    public static void minimum2(List<Integer> nums) {

        Integer min = nums.
                stream().
                distinct(). //2, 3, 4, 5, 11, 10
                        reduce((t, u) -> t > u ? u : t).get();

        System.out.println(min); //2

    }


    //3..yol

    //sorted(Comparator.reverseOrder()) ifadesi,
    // Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
    //Comparator class, reverseOrder() methoddur.{

    public static void minimum3(List<Integer> nums) {

        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).
                get();
        System.out.println(min);


    }

    //4.yol

    public static void minimum4(List<Integer> nums) {
     /*   Integer min =nums.
                stream().
                distinct().
                sorted().
                reduce((t,u)->t).
                get();
        System.out.println(min);*/

        Optional<Integer> min = nums.// listede eleman olamma durumu var onun icin guvenli
                stream().
                distinct().
                sorted().
                reduce((t, u) -> t);

        if (min.isPresent()) {
            System.out.println(min.get());
        } else {
            System.out.println("Liste bos veya minimum deger bulunamadi ");
        }




    }

    //5. yol best praktis
    public static void minimum5(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                reduce(Math::min).
                get();
        System.out.println(min);//2
    }

       //8) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
       //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi

       //8) Create a method that finds the smallest even number greater than 7 in the given list.
       //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- Smallest even number greater than 7


    public static void getMinGreaterThanSevenEven(List<Integer> nums){

        //findFirst(): Sıralı akışta bulunan ilk elemanı (yani yani bu senaryo da en küçük elemanı) alır.
        // Bu işlem bir Optional döndürür, çünkü akışta hiç eleman kalmamış olabilir
        // (filtreleme nedeniyle veya başka bir sebepten dolayı)

        //Integer min =nums.stream().filter(t-> t>7 && t % 2 == 0).sorted().reduce((t,u)->t).get();
        //System.out.println(min);//10

        Integer min =nums.stream().filter(t-> t>7 && t % 2 == 0).sorted().findFirst().get();// siralama yapinca ilk emenani almak
        System.out.println(min);//10


    }

}