package polymorphism;

public class methodOverlording {
    public void meth(){
        System.out.println("this is method one");
    }
    public void meth(int x, int y){
        System.out.println("this is method two");
    }
    public void meth(int x, int y, String name){
        System.out.println("this is method three");
    }

    public static void main(String args[]){
        methodOverlording methodOverlording = new methodOverlording();
        methodOverlording.meth();
        methodOverlording.meth(1,2);
        methodOverlording.meth(1,2,"Maleesha");
    }
}
