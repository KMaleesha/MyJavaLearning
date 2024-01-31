package superKeyword;

class Student{
    String Name;
    String School;
    int age;
    int marks;

    Student(String Name, String School, int age, int marks){
        this.Name = Name;
        this.School = School;
        this.age = age;
        this.marks = marks;
    }

}
class Maleesha extends Student{
    String address;
    Maleesha(String Name, String School, int age,int marks, String address){
        super(Name,School,age,marks);
        this.address = address;
    }

}
public class ExampleTwo {
    public static void main(String args[]){
        Maleesha maleesha = new Maleesha("Maleesha","SMV",25,75,"Kuliyapitiya");
        System.out.println(maleesha.Name);
        System.out.println(maleesha.School);
        System.out.println(maleesha.age);
        System.out.println(maleesha.marks);
        System.out.println(maleesha.address);
    }
}
