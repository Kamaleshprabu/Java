import java.util.*;
public class dowhileloop {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        do{
            System.out.print("Enter Value for A > 10: ");
            a = scan.nextInt();
        }while(a < 10);

        scan.close();
    }
}
