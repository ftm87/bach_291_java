package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {

       // Engine e =new Engine() ;    interfecelerden object uretilmez

        AudiA4 a4 =new AudiA4();
        a4.turbo();//Audi A4 turbo motor kullanir
        a4.esp();//Audi A4 esp fren sistemi kullanir
        a4.digital();//Audi A4 dijital klima kullanir
        a4.run();//Audi A4 havayastigi calistirir

        System.out.println(Engine.fiyat);//300  yapi sitatic oldugu icin karismiyor
        System.out.println(AC.fiyat);//200
        System.out.println(Break.fiyat);//100

        Engine.speed();
        a4.power();
    }
}


