package Lambda;

interface ClassA{
    void display();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        ClassA obj = new ClassA() {  // Creating an Inner Class and its body within the interface ClassA
            public void display(){   // The display() method is override in the Inner Class
                System.out.println("This is Display Method");
            }
        };
        obj.display();  // Now we can call the method using object
    }   //This is called Functional Interface
}
