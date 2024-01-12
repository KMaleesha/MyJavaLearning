public class Array {
    public static void main(String[] args){

        // we can not add or change the array as we create like this
        int[] numbers = {1,2,3,4,5,6};
        String[] names = {"Java", "Python", "JavaScript", "SpringBoot","Flask", "Docker"};

        System.out.println(numbers[4]);
        System.out.println(names[4]);

        //we can give the size and next add the elements
        String[] animal = new String[6];
        animal[0] = "Dog";
        animal[1] = "Cat";
        System.out.println(animal[0]);
        System.out.println(animal[3]);

        int[][] num = {{0,2,4,6},{23,5,43,1},{4,78,5,23}};
        System.out.println(num[2][2]);
    }
}
