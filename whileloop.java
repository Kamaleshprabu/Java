import java.util.*;
public class whileloop {
    //While loop is used when the ending is unknown
    public static void main(String args[]){
        Random rand = new Random();  //To create a Random Number
        int RandNum = rand.nextInt(11);  //From 0 to 11, 11 is excluded so, -> 1 to 10

        while(RandNum != 5){
            RandNum = rand.nextInt(11);
            System.out.println(RandNum);
        }
    }
}
