public class constructor {

    int marks;
    String name;

    //Constructor
    constructor(){
        System.out.println(marks);
    }

    constructor(int a){
        System.out.println(a);
        System.out.println("hello");
    }

    constructor(int a, String b){
        marks = a;
        name = b;
    }

    public static void main(String agrs[]){

        constructor con = new constructor(); 

        constructor con1 = new constructor(10);
        System.out.println(con.marks);

        con.marks = 40;
        con.name = "Hasan";
        System.out.println(con.marks);

        constructor con2 = new constructor(50, "sam");
    }
}
