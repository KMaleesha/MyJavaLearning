package constructor;

public class testTwo {
    int name;

    testTwo(){
        name = 23+23;
        System.out.println("my test result "+name);
    }

    void testMethod(){
        int y = 90;
        System.out.println("my test two result "+ y);
    }

    public static void main(String[] args){
        testTwo myTestResult = new testTwo();
        myTestResult.testMethod();
        System.out.println(myTestResult.name);
    }
}
