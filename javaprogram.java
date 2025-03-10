import java.util.*;

class ClassA{
    int mark = 10;

    class ClassB{
        void display(){
            System.out.println(mark);
        }
    }
}

public class javaprogram{
    public static void main(String args[])
    {
        //print statement ->
        System.out.println("Hello World!");

        //initialization ->
        int container = 20;
        String container2 = "luffy";
        System.out.println(container);
        System.out.println(container+ " is " + container2 + " age");

        int a = 10, b = 20;
        System.out.println(a + b);

        int c = 2;
        System.out.println((a + b)/ c);

        //User input ->
               //integer input :
        Scanner scan = new Scanner(System.in); //One scanner is enough for a block
        int d = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(d + e);

        scan.nextLine();
               //String input :
        String myName = scan.nextLine();
        System.out.println(myName);

        //Data types
        
        byte no1 = 10;
        short no2 = 20;
        int no3 = 30;
        long no4 = 40;

        float no_f1 = 20.30f;
        double no_f2 = 333.33333;

        char name1 = 'A';
        String name2 = "Kamlesh";
        
        boolean bo1 = true;
        boolean bo2 = false;

        ClassA obj = new ClassA();
        ClassA.ClassB obj2 = obj.new ClassB();
        obj2.display();

    } 
}

