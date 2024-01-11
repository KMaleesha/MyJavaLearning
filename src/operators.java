public class operators {

    public static void main(String[] args){
        int x = 10;
        x = x + 1;
        System.out.println(x);

        //post increment
        x++;
        System.out.println(x);

        //pre increment
        ++x;
        System.out.println(x);

        //post increment
        int a = 10;
        int b = a++;
        System.out.println("--- post increment ---");
        System.out.println(a);
        System.out.println(b);

        //pre increment
        int i = 10;
        int j = ++i;
        System.out.println("---pre increment ---");
        System.out.println(i);
        System.out.println(j);

        //post decrement
        int c = 10;
        int d = c--;
        System.out.println("--- post decrement ---");
        System.out.println(c);
        System.out.println(d);

        //pre decrement
        int q = 10;
        int k = --q;
        System.out.println("--- Pre Decrement ---");
        System.out.println(q);
        System.out.println(k);

        int n = 20;
        System.out.println("-- other --");
        n += 5;
        System.out.println(n);
        n -= 5;
        System.out.println(n);
        n /= 5;
        System.out.println(n);
        n *= 5;
        System.out.println(n);
    }
}
