package superKeyword;

class TestOne{
    public void print(){
        System.out.println("Print Test one class");
    }
}

class TestTwo extends TestOne{
    public void print(){
        super.print();
        System.out.println("Print Test two class");
    }
}
public class ExampleOne {
    public static void main(String args[]){
        TestTwo testTwo = new TestTwo();
        testTwo.print();
    }
}
