package d28exception_enum;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla cath blogu kullanilabilir miyiz
        int a = 12;
        int b = 4;
        String s = "My Java";
        //getCharFromString();

        getCharFromString(s,a,b);
    }

    //1.yol:
    public static void getCharFromString(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (ArithmeticException e) {
            System.out.println("Sifira bolme yapilmaz" + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandiniz" + e.getCause());

        }
    }


        //2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir
        public static void getCharFromString2(String s,int a ,int b){
            try {
                int idx = a / b;
                char ch = s.charAt(idx);
                System.out.println(ch);

            } catch (Exception e) {
                System.out.println("bir istisna olustu" + e.getClass());
            }


        }
    }
