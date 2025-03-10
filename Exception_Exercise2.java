import java.util.*;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

class AgeValidator{
    void checkAge(int age){
        try{
            if(age < 0 || age > 150){
                throw new InvalidAgeException("Age is Not Valid");
            }
            System.out.println("Valid Age");
        } catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}

public class Exception_Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        AgeValidator AV = new AgeValidator();
        AV.checkAge(age);
        scan.close();
    }
}
