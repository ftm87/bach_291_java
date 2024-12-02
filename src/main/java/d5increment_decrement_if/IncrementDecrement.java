package d5increment_decrement_if;

public class IncrementDecrement {

    public static void main(String[]args) {

        //--------Increment

        int a = 5;
        a = a + 2;    // a iki defa yazilmis,tekrradn kurtulalaim
        System.out.println(a);//7
        a += 2; // a=a+2 nin aynisidir
        System.out.println(a);//9

        System.out.println(a);

        //----------------Decrement

        int c=10;
        c = c-3;
        System.out.println(c);
        c -=4;
        System.out.println(c);

        //-----------------carpma

        int d=6;
        d=d*2;
        System.out.println(d);
        d*=2;
        System.out.println(d);

        //--------------------bolme

        int e=24;
        e =e /2;
        System.out.println(e);
        e/=2;
        System.out.println(e);

        //--------------------1 ile increment
        int f =13;
        f = f+1;
        f+=1;
        f++;
        System.out.println(f);

        //----------------------1 ile decerement

        int h=25;
        h =h-1;
        h-=1;
        h--;
        System.out.println(h);

        //-----------------------Post Increment (i++), Pre Increment(++i)

        int i=10;
        int k=i++;
        System.out.println(k);//10
        System.out.println(i);//11

        int m = 15;
        int n=++m;
        System.out.println(n);//16
        System.out.println(m);//16

        int p=17;
        int r=p--;
        System.out.println(r);//17
        System.out.println(p);//16

        int s=20;
        int t=--s;
        System.out.println(t);//19
        System.out.println(s);//19

    }
}
