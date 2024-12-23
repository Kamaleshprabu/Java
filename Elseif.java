import java.util.*;
public class Elseif {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your score: ");
        int score = scan.nextInt();

        if(score > 90){
            System.out.println("Gift: MacBook Pro");
        }
        else if(score > 60){
            System.out.println("Gift: Iphone");
        }
        else if(score > 35){
            System.out.println("Gift: MacBook Pro");
        }
        else{
            System.out.println("No Gifts");
        }
    }
}
