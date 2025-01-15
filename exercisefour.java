import java.util.*;
public class exercisefour {
    public static void main(String args[]){

        //Exercise - 1
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter Value for numbers[" + i + "] :");
            numbers[i] = scan.nextInt();
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println("The value in the index " + i + " of numbers is " + numbers[i]);
        }

        //Exercise - 2
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < numArray.length; i++){
            System.out.println("The value in the index " + i + " of numbers is " + numArray[i]);
        }

        //Exercise - 3
        for(int i = 2; i <= 10; i++){
            System.out.println("2 * " + i + " = " + i * 2);
        }

        //Exercise - 4
        System.out.print("Enter The Size Of An Array: ");
        int size = scan.nextInt();
        int[] numArray2 = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter value for the index " + i + " of numArray2 : ");
            numArray2[i] = scan.nextInt();
        }
        System.out.println(numArray2[size/ 2]);
        System.out.println(7/2);

        scan.close();
    }
}
