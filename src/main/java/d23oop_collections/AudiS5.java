package d23oop_collections;

public class AudiS5 implements Engine,AC,Break {


    @Override
    public void eco() {
        System.out.println("AudiS5 ekonomik motor kullanir");
    }

    @Override
    public void turbo() {
        System.out.println("AudiS5 turbo motor kullanir");
    }

    @Override
    public void gas() {
        System.out.println("AudiS5 benzinli motor kullanir");
    }

    @Override
    public void run() {
        System.out.println("AudiS5 benzinli motor kullanir");
    }

    @Override
    public void analog() {
        System.out.println("AudiS5 analog kullanir");
    }

    @Override
    public void digital() {
        System.out.println("AudiS5 dijital kullanir");
    }

    @Override
    public void abs() {
        System.out.println("AudiS5 dijital  klima kullanir");
    }

    @Override
    public void esp() {
        System.out.println("AudiS5 benzinli motor kullanir");
    }
}
