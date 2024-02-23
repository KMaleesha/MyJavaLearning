package multiThreading;
class DisplaySync{
     void print(){
        Thread t = Thread.currentThread();
        synchronized (this){
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
}

class T2 extends Thread{
    DisplaySync d;

    T2(DisplaySync d){
        this.d = d;
    }
    public void run(){
        d.print();
    }
}

public class TestSyncOne {
    public static void main(String args[]){
        DisplaySync display = new DisplaySync();

        T2 objT = new T2(display);
        T2 objt1 = new T2(display);

        objT.start();
        objt1.start();
    }
}
