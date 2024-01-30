package polymorphism.methodOverriding;

public class child extends parent{
    public void phone(){
        System.out.println("my phone Samsung");
    }
    public static void main(String[] args) {
        child child = new child();
        child.phone();
    }
}
