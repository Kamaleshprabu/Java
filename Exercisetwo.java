import java.util.*;
public class Exercisetwo {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for mark: ");
        int mark = scan.nextInt();
        if(mark >= 35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.print("Enter your income: ");
        float income = scan.nextFloat();
        if(income >= 7000){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("Scholarship is not available");
        }

        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        if(number%3 == 0 && number%5 == 0){
            System.out.println("Given number is divided by both 3 and 5");
        }
        else{
            System.out.println("Given number is not divided by both 3 and 5");
        }

        System.out.print("Enter a number to find Odd or Even: ");
        int num = scan.nextInt();
        if(num%2 == 0){
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }
    }
}
