package AbstractInterface;

public class Maleesha implements student{

    @Override
    public void AverageMarks() {
        System.out.println("My Average Mark will be 50");
    }

    @Override
    public void TotalMark() {
        System.out.println("My total mark will be 200");
    }

    @Override
    public void CGPA() {
        System.out.println("My CGPA will be 3.1");
    }

    @Override
    public void Class() {
        System.out.println("My class will be second lower");
    }

    public static void main(String args[]){
        Maleesha maleesha = new Maleesha();
        maleesha.AverageMarks();
        maleesha.CGPA();
        maleesha.Class();
        maleesha.TotalMark();
        student student = new Maleesha();
        System.out.println(student.studentMarks);
    }
}
