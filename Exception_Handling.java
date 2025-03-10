import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //  Try - Consists of statements that can cause Error 
        try{
            int totalMarks = scn.nextInt();
            int numOfSubs = scn.nextInt();

            if(totalMarks < 1 || numOfSubs < 1){

                //  Throw - Used to Explicitly throw an Error to Catch Black, with a Message we need !
                throw new Exception("Invalid Marks or Total Subjects");
            }else{
                int Avg = totalMarks / numOfSubs;
                System.out.println(Avg);
            }
        } 

        //  Catch - Consists of statements that can be execute when error occurs
        //  We can also specify a catch for an specific Error
        catch(InputMismatchException e){   //  This catch block for Input data type mismatch
            System.out.println(e);
        }
        catch(ArithmeticException e){    //  This catch block for Arithemertic Errors
            System.out.println(e);
        }
        catch(Exception e){   //  Simple Catch block - Used to catch all types of Error and also User Defined Errors
            System.out.println(e);
        }

        /*  Finally - Consists of statements those are definitely needs to execute,  
            Either there is an Error or Not, It will Execute  */
        finally{
            System.out.println("It's Finally");
            scn.close();
        }
    }
}
