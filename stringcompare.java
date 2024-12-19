import javax.swing.text.StyledEditorKit;
import java.util.*;
public class stringcompare {
    public static void main(String args[])
    {
        String f1 = "apple";
        String f2 = "apple";

        String a1 = new String("orange");
        String a2 = new String("orange");

        System.out.println(f1==f2);
        System.out.println(a1==a2);

        System.out.println(a1.equals(a2));
        System.out.println(f1.equals(f2));

        String a3 = a2;
        System.out.println(a2==a3);

        //Exercise
        Scanner scan = new Scanner(System.in);
        String RCB = scan.nextLine().toUpperCase();

        if( RCB.equals("WIN")){
            System.out.println("Ee sala cup Namdhey");
        }
        else{
            System.out.println("Cup illa");
        }

        //Exercise-2
        String megna = scan.nextLine().toUpperCase();

        if( megna.equals("DEAD")){
            System.out.println("Megna is Dead");
        }
        else{
            System.out.println("Megna is Alive");
        }
    }
}
