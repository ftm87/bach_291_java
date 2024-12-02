package d22oop;

public class StudentRunner {

    public static void main(String[] args) {

        Student s =new Student();
        System.out.println(s.name);//Ali Can

        System.out.println(s.getAge());//13
        System.out.println(s.isSuccesful());//true

        s.setAge(25);        //set ile methodu degistirebilirz
        System.out.println(s.getAge());//25

        s.setSuccesful(false);
        System.out.println(s.isSuccesful());//false

    }
}
