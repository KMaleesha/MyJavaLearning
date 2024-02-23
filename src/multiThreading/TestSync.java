package multiThreading;
class Display{
    synchronized void print(){
        Thread t = Thread.currentThread();
        for(int i = 0; i<5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(t.getName());
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class T extends Thread{
    Display d;

    T(Display d){
        this.d = d;
    }
    public void run(){
        d.print();
    }
}

public class TestSync {
    public static void main(String args[]){
        Display display = new Display();

        T objT = new T(display );
        T objt1 = new T(display);

        objT.start();
        objt1.start();
    }
}
