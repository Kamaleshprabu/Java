package interface_concept;

interface Class1{
    
//  Interface does not have constructor, so Not able to create object

    int num = 10;  //Variables are defaultly Public, Static, Final
    void display();  //Methods are defaultly Abstract, so No body

    default void display2(){
        System.out.println("Method in Interface using default keyword");
    }

    static void dislay3(){
        System.out.println("Method in Interface using static keyword");
    }
}

class Class2 implements Class1{ //Implements Keyword used to inherite the Interface

//  num = 20;  Interface variables are defaultly final, so it cannot be modified

    public void display(){
        System.out.println("This is Class 2");
    }
}

class Class3 implements Class1{

    public void display(){
        System.out.println("This is Class 3");
    }
}

public class interfaceUsage {
    public static void main(String[] args) {
        Class2 C2 = new Class2();
        C2.display();
        C2.display2();

        Class3 C3 = new Class3();
        C3.display();
        C3.display2();

        System.out.println(Class1.num);  //Accessing num variable using its class name because it is static
        Class1.dislay3();  //Accessing display3 Method using its class name because it is static
    }
}
