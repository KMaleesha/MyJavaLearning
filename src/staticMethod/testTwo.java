package staticMethod;

//without static methods and attributes
public class testTwo {
    String name;

    void call(){
        System.out.println("Make a call from "+name);
    }

    public static void main(String[] args){
        testTwo myphone = new testTwo();
        myphone.name = "iPhone";
        myphone.call();

        testTwo myphone1 = new testTwo();
        myphone1.name = "iPhone1";
        myphone1.call();

        testTwo myphone2 = new testTwo();
        myphone2.name = "iPhone2";
        myphone2.call();

    }
}
