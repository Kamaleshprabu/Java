import java.util.*;
public class exercisethree {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for A: ");
        int a = scan.nextInt();
        System.out.print("Enter value for B: ");
        int b = scan.nextInt();
        //Exercise-1
        for(int i = a; i <= b; i++)
        {
            System.out.println("i is " + i);
        }
        //Exercise-2
        for(int i = 1; i <= b; i++){
            if(i % 2 == 0){
                System.out.println("Even number: " + i);
            }
        }
        //Exercise-3
        int count = 0;
        for(int i = 1; i <= b; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
        //Exercise-4
        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("The number divisible by both 3 and 5: " + i);
            }
        }
    }
}
