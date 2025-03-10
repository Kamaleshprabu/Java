package FileHandling;

import java.io.FileWriter;

public class appending{
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("filewriterExample.txt", true);
            fw.write(", from Koliyanur, Villupuram.");
            fw.close();
            System.out.println("Success");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
