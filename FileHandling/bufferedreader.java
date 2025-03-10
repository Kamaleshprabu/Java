package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class bufferedreader {
    public static void main(String[] args) {
        try{
            FileReader fw = new FileReader("filewriterExample.txt");
            BufferedReader br = new BufferedReader(fw);
            int C = br.read();
            String S = br.readLine();
            System.out.println((char)C);
            System.out.println(S);
            fw.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
