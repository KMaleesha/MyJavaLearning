package thisKeyword;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]){
        Student student = new Student("Maleesha", 25);
        System.out.println(student.age);
        System.out.println(student.name);
    }
}
