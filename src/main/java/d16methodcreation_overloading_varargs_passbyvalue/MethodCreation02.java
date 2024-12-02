package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {

    public static void main(String[] args) {// main metodunun amacı: programın başlangıç noktası, diğer metodları çağırarak işlemleri gerçekleştirmek


        int result1 =multiply(3,5); // burda method cagrisini yapiyoruz.methodu callistirmak icin cagirirr.ve methodu icinde tutar yani artik bura 15 oldu
        System.out.println(result1);//15


        int result2 =firstMultiplyThirdAdd(4,4,2);// buranin yeni hali 18 oldu.ilk ikisini carp 3.yu ekle
        System.out.println(result2);//18

        print("Ali Can");// void dogrudan yazdirir



    }// main dizizsi


        //ornek 1: Iki sayiyi carpan bir method olusturunuz.
        //example 1: Create a method that multiplies two numbers


        //protected: Bu class’tan erisilebilir.
        //Bir de sadece miras alinan class’lardan erisilebilir(extends)


        protected  static  int multiply(int a, int b){
            return a*b;       // burda return kullanmak int den dolayi

        }

        //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.

        //example 2: Create a method that multiplies the first two of the given 3 numbers and adds the result with the third number.


       //private : Buraya sadece ayni class icerisinden erisilebilir.Diger class’lar erisemez

        private static int firstMultiplyThirdAdd(int a,int b,int c){

            return a*b+c;
        }


            //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)

            //example 3: Create a method that prints an entered word to the console

            //Eger bir method yeni bir data uretmiyor ise return type’i void olur.void ise return yazilmaz

        public  static  void print(String str){
            System.out.println(str);  // return olmadigi icin karsilama gerekmez cunku void

        }
    }
