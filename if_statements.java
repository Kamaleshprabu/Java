import java.util.*;
class if_statements{
    public static void main(String args[]){
        boolean rain = true;
        if(rain){
            System.out.println("Take an umbrella");
        }
        else{
            System.out.println("Enjoy the sunlight");
        }

        int num1 = 40;
        int num2 = 20;
        if(num1 < num2){
            System.out.println("Num1 is Greater");
        }
        else{
            System.out.println("Num2 lesser than Num1");
            num2 = num1 + 20;
        }

        if(num1 >= num2){
            System.out.println("Num1 is Greater");
        }
        else{
            System.out.println("Num2 is Greater");
        }

        //Exercise - 1
        if(num1 == num2){
            System.out.println("Both the numbers are equal");
        }
        else{
            System.out.println("Both the numbers are not equal");
        }

        //Exercise - 2
        Scanner scan = new Scanner(System.in);
        int userin1 = scan.nextInt();
        int userin2 = scan.nextInt();
        if(userin1 == userin2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}