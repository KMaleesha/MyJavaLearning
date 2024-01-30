package accessModifiers.publicAndPrivate.pack1;

public class paramee {
    private int a = 10;
    public int b = 20;

    public static void main(String args[]){
        paramee paramee = new paramee();
        System.out.println(paramee.a);
        System.out.println(paramee.b);
    }
}
