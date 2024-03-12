package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class buffer_reader {
    public static void main(String[] args) {
        File file = new File("test2.txt");
        try{
            BufferedReader  bufferedReader = new BufferedReader(new FileReader(file));


            String i;
            while ((i = bufferedReader.readLine()) != null){
                System.out.println(i);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
