import java.util.*;

public class javaprogram{
    public static void main(String args[])
    {
        //print statement ->
        System.out.println("Hello World!");

        //initialization ->
        int container = 20;
        String container2 = "luffy";
        System.out.println(container);
        System.out.println(container2);

        int a = 10, b = 20;
        System.out.println(a + b);

        int c = 2;
        System.out.println((a + b)/ c);

        //User input ->
               //integer input :
        Scanner num1 = new Scanner(System.in);
        int d = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        int e = num2.nextInt();
        System.out.println(d + e);

               //String input :
        Scanner name = new Scanner(System.in);
        String myName = name.nextLine();
        System.out.println(myName);
    } 
}

