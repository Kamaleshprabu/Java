import java.util.Scanner;

class DivisionExample{
    void divideNumers(int num1, int num2){
        try{
            int result = num1 / num2;
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("Cannot Divisible By Zero");
        }
    }
}

public class Exception_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        DivisionExample DE = new DivisionExample();
        DE.divideNumers(num1, num2);
        scan.close();
    }
}
