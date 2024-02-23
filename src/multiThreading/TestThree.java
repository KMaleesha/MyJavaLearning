package multiThreading;

class C implements Runnable{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Welcome");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class D implements Runnable{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Hey");
            try {
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class TestThree {
    public static void main(String args[]){
        C obj1 = new C();
        Thread o1 = new Thread(obj1);
        o1.start();

        try {
            Thread.sleep(50);
        }catch (Exception e){
            System.out.println(e);
        }

        D obj2 = new D();
        Thread o2 = new Thread(obj2);
        o2.start();
    }
}
