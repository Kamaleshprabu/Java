class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}

class Employee extends Person{
    int employeeId;
    Employee(String name, int Id){
        super(name);
        this.employeeId = Id;
    }

    void details(){
        System.out.println(employeeId);
        System.out.println(name);
    }
}

public class superExercise {
    public static void main(String[] args) {
        Employee Emp = new Employee("Kamalesh", 1201);
        Emp.details();
    }
}
