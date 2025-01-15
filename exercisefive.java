import java.util.Scanner;

public class exercisefive {

    void evenorodd(int num){
        if(num % 2 == 0){
            System.out.println("Is Even Number");
        }else{
            System.out.println("Is Odd Number");
        }
    }

    String passorfail(int mark){
        if(mark >= 40){
            return "Pass";
        }else{
            return "Fail";
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to check Odd or Even: ");
        int num = scan.nextInt();

        exercisefive obj = new exercisefive();
        obj.evenorodd(num);

        System.out.print("Enter Mark: ");
        int mark = scan.nextInt();
        String result = obj.passorfail(mark);
        System.out.println(result);
        
        scan.close();
    }
}
