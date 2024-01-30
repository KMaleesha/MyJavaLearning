//we use final key word for exact numbers. not changing numbers like py
//using final method we can not override these methods
//we can not inherit final class for another class
final class Test {
    final public void testOne(){
        System.out.println("This can not override");
    }
}

public class finalKeyword{
    public static void main(String args[]){
        Test test = new Test();
        test.testOne();
    }
}
