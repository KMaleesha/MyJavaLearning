package collections;

import java.util.ArrayList;

public class arrayList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(10);
        System.out.println(arr);
        arr.add(0,12);
        arr.set(1,39);
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.contains(10));
        System.out.println(arr.get(1));
        System.out.println(arr.indexOf(10));
        System.out.println(arr.lastIndexOf(12));

        arr.forEach(x -> System.out.println(x));
    }
}
