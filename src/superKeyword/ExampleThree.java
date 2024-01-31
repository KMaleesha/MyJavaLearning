package superKeyword;

class animal{
    String name;
    int age;
    boolean legs;

    animal(String name, int age, boolean legs){
        this.name = name;
        this.age = age;
        this.legs = legs;
    }
}

class Bird extends animal{
    boolean fethers;
    Bird(String name, int age, boolean legs, boolean fethers){
        super(name,age, legs);
        this.fethers = fethers;
    }
}
public class ExampleThree {
    public static void main(String args[]){
        Bird bird = new Bird("yuki", 1,true,true);
        System.out.println(bird.fethers);
        System.out.println(bird.name);
    }
}
