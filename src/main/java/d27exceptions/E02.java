package d27exceptions;

public class E02 {
    public static void main(String[] args) {

        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        String s = "1234a";
        convertStringToInt(s);

    }

    public static void convertStringToInt(String s) {

        try {
            int ints = Integer.valueOf(s);
            System.out.println(ints + 1);//1235
        }catch (NumberFormatException e){
            System.out.println("donusum icin rakam disi karakter kullanmayiniz:"+e.getMessage());
        }
    }
}