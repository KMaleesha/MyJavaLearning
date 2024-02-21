package generics;

public class exampleTwo<T> {

    T[] arr = (T[]) new Object[3];
    public static void main(String args[]){

        exampleTwo<Integer> exampleTwo = new exampleTwo();
        exampleTwo.arr[0] = 10;
        exampleTwo.arr[1] = 34;
        exampleTwo.arr[2] = 12;

        int num;
        for (int i = 0; i<3; i++){
            num = exampleTwo.arr[i];
            System.out.println(num);
        }
    }
}
