package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class buffer_writer {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file1.txt", true));
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("Welcome");
            bufferedWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
