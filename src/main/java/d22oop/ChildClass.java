package d22oop;

public class ChildClass extends ParentsClass {

    @Override
    public Integer multiply(Integer a, Integer b) {

       //Paranets class in multply methodunu cagirdik
        Integer sonuc= super.multiply(a, b);

      // Ek islevsellik  katalim
      return sonuc+10;

      // parent method degismez
    }
}
