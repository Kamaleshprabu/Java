import java.util.*;
public class Exerciseone {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String address = scan.nextLine();
        System.out.println("My name is "+ name);
        System.out.println("My age is "+ age);
        System.out.println("My address is "+ address);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = a * b * c;
        int e = a + b + c;
        System.out.println(d/e);

        String name_name = scan.nextLine();
        float score = scan.nextFloat();
        scan.nextLine();
        String dept = scan.nextLine();
        System.out.println("My name is " + name_name);
        System.out.println("My score is " + score/10 + " /10");
        System.out.println("My dept is " + dept);
    }
}
