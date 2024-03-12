package fileHandling;

import java.io.FileReader;

public class file_reader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("test2.txt");
            System.out.println(fileReader.read());

            int i;
            while ((i = fileReader.read()) != -1){
                System.out.println((char)i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
