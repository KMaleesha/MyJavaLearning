package AbstractMethod;

public class Nimal extends Saman{
     public void eat(){
         System.out.println("I would like to have some Snacks");
     }

     void run(){
         System.out.println("I can run fast");
     }

     public static void main(String args[]){
         Nimal nimal = new Nimal();
         nimal.swim();
         nimal.run();
         nimal.eat();
     }
}
