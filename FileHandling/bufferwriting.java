package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class bufferwriting {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("filewriterExample2.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("HI");
            bw.newLine();
            bw.write("Im Kamalesh");
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
