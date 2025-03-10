package package_one;

//Default class - Accessed within the same package
class Account{
    String Acc_name = "Kamalesh";
}

class Balance{
    //Private variable - Accessed only within the class
    private int balance = 50000;
    void display(){
        System.out.println(balance);
    }
} 

class Acc_Type{
    //Accessed Within Same package or Another package using inheritance
    protected String Acc_Type = "Major";
}

public class Student {

    //Accessed Within Same package or Another package using inheritance
    protected void display(){
        Account A = new Account();
        System.out.println(A.Acc_name);

        Balance B = new Balance();
        B.display();
    }
    public static void main(String[] args){
        Account A = new Account();
        System.out.println(A.Acc_name);

        Balance B = new Balance();
        //System.out.println(B.balance); - mark variable is not visible because it is private variable
        B.display();

        Acc_Type AT = new Acc_Type();
        System.out.println(AT.Acc_Type);
    }
}
