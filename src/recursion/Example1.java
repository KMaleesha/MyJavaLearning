package recursion;

public class Example1 {
    public int factorial(int n){
        if( n == 0){
            return 1;
        }else{
            return (n* factorial(n-1));
        }
    }
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        int result = example1.factorial(5);
        System.out.println(result);
    }
}
