package d20staticblock_instanceblock_oop;

public class AnimalRunner {
    public static void main(String[] args) {


        Dog d = new Dog();// dg nesnesi atasindan gelen ozellikleri kullanir
        d.bark();//Dogs bark
        d.feedWithMilk();//Mammals feed their babies with milk
        d.drink();//Animals drink


         Bird b =new Bird();
         b.tweet();//birds tweet
         b.eat();//Animals eat.
         b.drink();//Animals drink


         Cat c = new Cat();
         c.meow();//cats meow
         c.feedWithMilk();//Mammals feed their babies with milk.
         c.drink();//Animals drink
         c.eat();//Animals eat



    }

}
