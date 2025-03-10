package interface_concept;

//Multiple Inheritance with the help of Interface

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class Monitor implements Printable, Showable{
    public void print(){
        System.out.println("Prinyable");
    }
    public void show(){
        System.out.println("Showable");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Monitor M = new Monitor();
        M.print();
        M.show();
    }
}
