package recursion;

public class Example2 {
    public int factorial(int i){
        if(i == 0){
            return 1;
        }else{
            return (i*factorial(i-1));
        }
    }
    public static void main(String[] args) {
        int n = 10;
        Example2 example2 = new Example2();
        int result = example2.factorial(n);
        System.out.println(result);
    }
}
