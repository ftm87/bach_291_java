package d23oop_collections;

public class HondaRunner {
    public static void main(String[] args) {

     // Honda h =new Honda();  Abstrakt classlardan obje uretilemez.honda bir abstrack class(cunku siniflandirma icin uretildi)

   Civic c =new Civic();
   c.engine();//gas 1.6 Eco

   Accord a =new Accord();
   a.engine();//"Gas ,2.0 Turbo"

   a.music();//Pro


    }
}
