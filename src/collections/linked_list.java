package collections;

import java.util.LinkedList;
import java.util.List;

public class linked_list {
    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1,2,3));
        linkedList.add(8);
        linkedList.add(2,12);
        System.out.println(linkedList);
        System.out.println(linkedList.clone());
        System.out.println(linkedList.get(3));

        linkedList.forEach(x -> System.out.println(x-3));
        linkedList.forEach(y -> {
            System.out.println(y);
            System.out.println(y*2);
            System.out.println(y+2);
        });
    }
}
