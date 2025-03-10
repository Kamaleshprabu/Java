package Exercise7;

//Abstract class used to contain Abstract Method
abstract class Animal{
    //Abstract Method should not have Body
    abstract void makeSound();  //Subclass Should use the Method
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Meoww");
    }
}

public class exercise7_p4 {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.makeSound();

        Cat C = new Cat();
        C.makeSound();
    }
}
