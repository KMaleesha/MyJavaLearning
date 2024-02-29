package fileHandling;

import java.io.FileWriter;

public class file_writer {
    public static void main(String[] args) {
        String Text = " \nMy Java Learn";

        try{
            FileWriter fileWriter = new FileWriter("test2.txt", true);
            fileWriter.write("Hello world");
            fileWriter.append(Text);
            fileWriter.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
