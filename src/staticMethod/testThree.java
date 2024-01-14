package staticMethod;

//simpler way
public class testThree {
    void call(String name){
        System.out.println("Make a call from "+name);
    }

    public static void main(String[] args){
        testThree myCall = new testThree();
        myCall.call("iPhone");
        myCall.call("LG");
        myCall.call("Huwawi");
    }
}
