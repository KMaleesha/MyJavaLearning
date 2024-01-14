package constructor;

//constructor name and class name always can be same
//according to the parameters(count) if there is a same name for the constructor the arguments will be change
public class testThree {

    testThree(String name){
        System.out.println("Test Three "+name);
    }
    testThree(String name, int marks){
        System.out.println("Test Three "+name+" has "+marks);
    }

    public static void main(String[]args){
        testThree myTestThree = new testThree("OOP");
        testThree myTest = new testThree("DS", 89);
    }
}
