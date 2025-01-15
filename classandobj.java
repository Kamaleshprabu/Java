public class classandobj {

    String name = "";
    String aim = "";
    int age = 0;
    int salary = 0;

    public static void main(String[] args) {
        
        //Creating Object for a class
        //SYNTAX: Class_name Object_name = new Class_name()
        classandobj obj1 = new classandobj();

        obj1.name = "Kamalesh Prabu";
        obj1.aim = "Software Developer";
        obj1.age = 20;
        obj1.salary = 500000;

        System.out.println(obj1.name + " & " + obj1.salary);

        classandobj obj2 = new classandobj();

        obj2.salary = 800000;

        System.out.println(obj1.name + " & " + obj2.salary);
    }
}
