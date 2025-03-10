import java.util.*;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int age = scan.nextInt();
            if(age < 18){
                throw new InvalidAgeException("Age should above 18");
            }
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
        finally{
            scan.close();
        }
    }
}
