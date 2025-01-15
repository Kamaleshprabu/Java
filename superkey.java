class Animal{
    int age;

    Animal(String name, int age){
        this.age = age;
        System.out.println(name);
    }

    void makeSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    Dog(int age){
        super("Monkey", age);
        super.makeSound();
        System.out.println(super.age);
    }
}

public class superkey {
    public static void main(String[] args) {
        Dog d1 = new Dog(10);
    }
}
