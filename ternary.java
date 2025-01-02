import java.util.*;
public class ternary {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter value for num2: ");
        int num2 = scan.nextInt();
        System.out.println(num1 > num2 ? "Num1 is Grater": "Num2 is Grater");
    }
}
