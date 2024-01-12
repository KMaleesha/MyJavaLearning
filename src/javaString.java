public class javaString {
    public static void main(String[] args){
        String name1 = "Maleesha";
        String name2 = "Tharuprabha";
        String name3 = new String("Kumarasinghe");
        String name4 = new String("Kumarasinghe");
        System.out.println(name1);
        System.out.println(name2);

        if(name3.equals(name4)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

        if(name3 == name4){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

        //make character array into String
        char[] x = {'j','a','v','a'};
        String str = new String(x);
        System.out.println(str);

        //check length
        String Status = "Active";
        System.out.println(Status.length());

        //to lowercase and uppercase
        System.out.println(Status.toLowerCase());
        System.out.println(Status.toUpperCase());

        //concat
        String adding = "Not";
        System.out.println(adding+Status);
        System.out.println(adding.concat(Status));
        System.out.println(adding.concat(" ").concat(Status));

        System.out.println(Status.isEmpty());
        System.out.println(Status.replace("Active","Inactive"));
        System.out.println(Status.contains("active"));
    }
}
