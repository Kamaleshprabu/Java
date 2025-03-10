import java.util.Scanner;

class userdetails{
    String name;
    int age;
    String address;
    userdetails(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void displayDetails(){
        System.out.println(this.name + " " + this.age + " " + this.address);
    }
}

public class tryout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to enter details ?... Enter 1 for Yes or 0 for No !!!");
        int need = scan.nextInt();
        scan.nextLine();
        scan.close();
        
        if(need == 1){
            System.out.println("Enter Your Name: ");
            String name = scan.nextLine();
            System.out.println("Enter Your Age: ");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter Your Address: ");
            String address = scan.nextLine();

            System.out.println("Do you want to save your details ?... Enter 1 for Yes or 0 for No !!!");
            int save = scan.nextInt();

            if(save == 1){
                userdetails person = new userdetails(name, age, address);
                person.displayDetails();
            }else{
                System.out.println("Thank you");
            }

        }else{
            System.out.println("Bye Bye...");
        }
    }
}
