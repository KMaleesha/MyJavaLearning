public class LogicalOperators {

    public static void main(String[] args){

        int x = 10;
        String status = "Active";

        if(x<=10 || status == "Inactive"){
            System.out.println("One operation is correct");
        }else{
            System.out.println("Operations are not correct");
        }

        if(x>=5 && status !="Active"){
            System.out.println("Operations are correct");
        }else{
            System.out.println("One operation is correct or neither both");
        }
    }
}
