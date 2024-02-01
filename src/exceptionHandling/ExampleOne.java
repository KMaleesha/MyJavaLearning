package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleOne  {
    public static void main(String args[]){
        int number1;
        int number2;
        int answer;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number 1: " );
            number1 = scanner.nextInt();
            System.out.print("Enter Number 2: ");
            number2 = scanner.nextInt();

            answer = number1 / number2;
            System.out.println("Answer is : "+answer);
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }catch (InputMismatchException inputMismatchException){
            System.out.println(inputMismatchException);
        }finally {
            System.out.println("Byee");
        }

    }
}
