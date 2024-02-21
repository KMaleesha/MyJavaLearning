package multiThreading;

class A extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}
class B implements Runnable{
    public void run(){
        System.out.println("Welcome");
    }
}

public class TestOne  {
   public static void main(String args[]){
       A obj1 = new A();
       obj1.start();

       B obj2 = new B();
       Thread threadB = new Thread(obj2);
       threadB.start();

   }

}
