package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class continousread {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("filewriterExample2.txt");
            int C = fr.read();
            while (C < 0) {
                System.out.println((char)C);
                C = fr.read();
            }


            BufferedReader br = new BufferedReader(fr);
            String S = br.readLine();
            br.close();

            while (S.length() > 0) {
                System.out.println(S);
                S = br.readLine();
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
