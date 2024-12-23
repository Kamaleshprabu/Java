import java.util.*;
public class nestedif {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose 1.Appu or 2.Kfc: ");
        int choose_one = scan.nextInt();

        if(choose_one == 1){
            System.out.print("Choose 1.Veg or 2.Non-Veg: ");
            int choose_two = scan.nextInt();
            if(choose_two == 1){
                System.out.println("Chicken curry");
            }
            else if(choose_two == 2){
                System.out.println("Matan curry");
            }
            else{
                System.out.println("Thanks For Visting");
            }
        }
        else if(choose_one == 2){
            System.out.print("Choose 1.chicken or 2.Matan: ");
            int choose_two = scan.nextInt();
            if(choose_two == 1){
                System.out.println("Veg-Biriyani");
            }
            else if(choose_two == 2){
                System.out.println("Maten Biriyani");
            }
            else{
                System.out.println("Thanks For Visting");
            }
        }
        else{
            System.out.println("You need to choose a Hotel");
        }
    }
}
