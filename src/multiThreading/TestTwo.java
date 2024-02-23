package multiThreading;

class X extends Thread{
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class Y extends Thread{
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("Welcome");
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class TestTwo {
    public static void main(String args[]){
        X obj1 = new X();
        obj1.start();

        try {
            Thread.sleep(50);
        }catch (Exception e){
            System.out.println(e);
        }

        Y obj2 = new Y();
        obj2.start();
    }
}
