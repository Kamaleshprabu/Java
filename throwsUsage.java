import java.util.*;

class ClassA{
    void division(int num1, int num2) throws Exception{
        int div = num1 / num2;
        System.out.println(div);
    }
}

public class throwsUsage {
    public static void main(String[] args) {
        ClassA A = new ClassA();
        Scanner scan = new Scanner(System.in);
        try{
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            A.division(num1, num2);
        } catch(Exception e){
            System.out.println(e);
        }
        scan.close();
    }
}
