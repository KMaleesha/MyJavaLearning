import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        String b = "maleesha";
        System.out.println(a);
        System.out.println(b);

        Scanner x = new Scanner(System.in);

        String name = x.nextLine();
        System.out.println("My name is "+name);

        int age = x.nextInt();
        System.out.println("My age is "+age);

        double weight = x.nextDouble();
        System.out.println("My weight is "+weight);

    }
}