package Exercise7;

class Person{
    public String name;
    protected int age;
    private String socialSecurityNumber;
    String address;

    void displaySSN(){
        System.out.println(socialSecurityNumber);
    }

    Person(String name, int age, String ssn, String address){
        this.name = name;
        this.age = age;
        this.socialSecurityNumber = ssn;
        this.address = address;
    }
}

class Employee extends Person{
    Employee(String name, int age, String ssn, String address){
        super(name, age, ssn, address);
    }
}

public class exercise7{
    public static void main(String args[]){
        Employee E = new Employee("Kamalesh", 20, "SSN12345", "Koliyanur");
        System.out.println(E.name);
        System.out.println(E.age);
        System.out.println(E.address);
        E.displaySSN();
    }
}
