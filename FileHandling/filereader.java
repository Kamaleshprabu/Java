package FileHandling;

import java.io.FileReader;

public class filereader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("filewriterExample.txt");
            int C = fr.read();
            System.out.println((char)C);
            fr.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
