package staticMethod;

//with static attributes and methods
public class testOne {
    static String name1;
    static String name2;
    static String name3;

    static void call1(){
        System.out.println("Make a call from "+name1);
    }
    static void call2(){
        System.out.println("Make a call from "+name2);
    }
    static void call3(){
        System.out.println("Make a call from "+name3);
    }

    public static void main(String[] args){
        name1 = "iPhone";
        name2 = "LG";
        name3 = "Huwawi";
        call1();
        call2();
        call3();
    }
}
