package fileHandling;

import java.io.File;

public class CreateFile {
    public static void main(String args[]){
        File file = new File("File.txt");

        try{
            //file.createNewFile();
            System.out.println(file.getName());
            System.out.println(file.exists());
            System.out.println(file.canRead());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.length());
            //file.delete();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
