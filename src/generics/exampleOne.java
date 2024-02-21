package generics;
class A<T>{
    public void print(T x){
        T y = (T) x;
        System.out.println(x);
    }
}

public class exampleOne {
    public static void main(String args[]){
        A<Integer> objA = new A();
        objA.print(10);

        A<String> objA1 = new A();
        objA1.print("Maleesha");
    }
}
