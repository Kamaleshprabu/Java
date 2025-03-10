package FileHandling;

import java.io.FileWriter;

public class filewriter_usage {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("filewriterExample.txt");
            fw.write("Hi, Im Kamalesh");
            fw.close();
            System.out.println("Success");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
