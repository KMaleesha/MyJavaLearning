public class switchCase {

    public static void main(String[] args){

        int marks =  65;

        switch (marks){
            case 80:
                System.out.println("Excellent");
                break;
            case 65:
                System.out.println("Good");
                break;
            case 55:
                System.out.println("Pass");
                break;
            case 35:
                System.out.println("Weak");
                break;
            case 25:
                System.out.println("bad");
                break;
            default:
                System.out.println("not in scope");
        }

        String day = "Monday";

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("School, Lectures or Classes");
                break;
            case "Saturday":
                System.out.println("Day Out or picnic");
                break;
            case "Sunday":
                System.out.println("Dharma School");
                break;
            default:
                System.out.println("Out of scope");
        }
    }
}
