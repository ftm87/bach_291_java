package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {
    public static void main(String[] args) {

        System.out.println("Student2.stdName=" +Student2.stdName);

       Student2 ali =new Student2();
        System.out.println(" ali age ="+ ali.age);


        Student2.staticMethod();//Ben static bir methodum
        ali.nonStaticMethod(); //Ben non static bir methodum


        String s = "Java kolaydir";
        s.substring(0,3);


    }
}
