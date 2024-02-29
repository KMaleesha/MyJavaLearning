package fileHandling;

import java.io.File;
import java.util.Scanner;

public class file_read {
    public static void main(String[] args) {
        File file = new File("test2.txt");

        try{
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }

            reader.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
