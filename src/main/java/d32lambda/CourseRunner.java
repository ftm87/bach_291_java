package d32lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CourseRunner {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);



        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(coursesList);


        //---------------------------------
            //1)Tum “averageScore” larin 91’den buyuk olup olmadigini kontrol eden kodu yaziniz.
    //1)Write the code that checks whether all “averageScore” is greater than 91

    //allMatch metodu, akıştaki (stream) tüm öğelerin belirli bir koşulu karşılayıp karşılamadığını
    // kontrol eder. Eğer akıştaki tüm öğeler bu koşulu sağlarsa true döndürür,
    // aksi takdirde false döndürür.(VE gibi)

       boolean result1 =coursesList.stream().allMatch(t-> t.getAvarageScore()>91);
        System.out.println(result1);//true


        //-------------------------------------
            //2)Tum kurslardaki ögrenci sayilarinin 100’den buyuk olup olmadigini kontrol eden kodu yaziniz.
    //2)Write the code that checks whether the number of students in all courses is greater than 100.

        boolean result2 =coursesList.stream().allMatch(t-> t.getNumberOfSudents()>100);
        System.out.println(result2);//true


        //-----------------------------------------

        //3)Kurs isimlerinden en az birinin “Turkish” kelimesini icerip icermedigini kontrol eden kodu yaziniz.
       //3)Write the code that checks whether at least one of the course names contains the word “Turkish”.

        boolean result3 =coursesList.stream().anyMatch(t-> t.getCourseName().contains("Turkish"));
        System.out.println(result3);//true


        //-----------------------------------------

        //4) Sezon isimlerinden en az birinin “Summer” kelimesini icerip icermedigini kontrol eden kodu yaziniz.
     //4) Write the code that checks whether at least one of the season names contains the word “Summer”.

        boolean result4=coursesList.stream().anyMatch(t-> t.getSeason().contains("Summer"));
        System.out.println(result4);//true


        //----------------------------------------

        //5) Kurs donemleri icinde “Fall” doneminin hic bulunmadigini kontrol eden kodu yaziniz.
        //5) Write the code that checks that there is no “Fall” period among the course periods.

        //noneMatch, Akıştaki hiçbir elemanın belirli bir koşulu karşılamadığını kontrol eder.
       //Eğer akıştaki hiçbir eleman koşulu karşılamıyorsa true döndürür, aksi takdirde false döndürür.

        boolean result5=coursesList.stream().noneMatch(t-> t.getSeason().contains("Fall"));
        System.out.println(result5);//true


        //------------------------------------

        //6) Kurs isimleri icinde “German” isminin hic bulunmadigini kontrol eden kodu yaziniz.
       //6) Write the code that checks that the name “German” is not included in the course names.

        boolean result6 =coursesList.stream().noneMatch(t-> t.getCourseName().contains("German"));
        System.out.println(result6);//true

        //-----------------------------

        //7)Average score’u en yuksek olan kursun ismini console yazdiran kodu yaziniz.
//7)Write the code that prints the name of the course with the highest average score in the console.

            //a) sorted, Stream içerisindeki elemanları doğal sıralamasına göre sıralar.(kucukten buyuge)
    //Özel bir sıralama için bir Comparator'da alabilir.
    //b) Comparator.comparing, belirli bir özelliğe göre elemanları sıralamak için bir Comparator oluşturur.
    //c) reversed, Bir Comparator'ın sıralama sırasını tersine çevirir.
    //d) findFirst, Stream'deki ilk elemanı döndüren bir Optional döner.


        /*        String name1 = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore).reversed()).
                findFirst().
                get().
                getCourseName();
        System.out.println(name1); //Turkish Night*/




         String name1 = coursesList.
                stream().
                max(Comparator.comparing(Course::getAvarageScore)).
                get().
                getCourseName();

        System.out.println(name1);//Turkish Night

        //----------------------------------------

            //8) Tum course object'lerini average score'a gore kucukten buyuge diziniz
    // ve ilk ikisi haric liste halinde console'a yazdiriniz.
    //8) Arrange all course objects from smallest to largest according to average score
    // and write it to the console as a list, excluding the first two.

        //a) skip, Belirtilen sayıda elemanı Stream’den atlar. Burda ilk 2'sini atladik
//b) collect(Collectors.toList()), Stream içerisindeki elemanları bir listeye dönüştürür.

        List<Course>mylist =coursesList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).toList();
        System.out.println(mylist);


        //----------------------------------------------

            //9) Tum course object’lerini average score’a gore kucukten buyuge diziniz ve
    // ilk ucunu liste halinde console’a yazdiriniz.
    //9) Arrange all course objects from smallest to largest according to the average score and
    // write the first end as a list to the console.

        //a) limit, Stream’den belirli sayıda eleman alır. Burda ilk 3'unu aldik


        List<Course> yourlist=coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore)).
                limit(3).
                toList();
        System.out.println(yourlist);

        //---------------------------------
        System.out.println("---------------------------");

            //10)Kursta bulunan ogrenci sayilarina gore, buyukten kucuge sirali bir sekilde
    //listin icinde veren kodu yaziniz.
    //10) According to the number of students in the course, in order from largest to smallest
    //Write the code that gives the list

        List<Course> stdntlist =coursesList.
                stream().
                sorted(Comparator.comparing(Course::getNumberOfSudents).reversed()).toList();

        System.out.println(stdntlist);

        System.out.println("---------------------------");

        //---------------------------

            // 11) Kursta bulunan Ingilizce bolumlerinin sayisini veren kodu yaziniz.
    // 11) Write the code that gives the number of English sections in the course.

        long  english =coursesList.stream().filter(t->t.getCourseName().contains("English")).count();
        System.out.println(english);

        //----------------------------------

        //12) Ogrenci sayisi 140’tan az olan kurslari bir liste halinde veren kodu yaziniz.
        //12) Write the code that lists courses with fewer than 140 students

        List<Course>newCourses= coursesList.stream().filter(t-> t.getNumberOfSudents()<140).collect(Collectors.toList());
        System.out.println(newCourses);

    }
}
