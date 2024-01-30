package Encapsulation;

public class main {
    public static void main(String args[]){
        Student student = new Student();
        student.setName("Maleesha");
        student.setAge(25);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
