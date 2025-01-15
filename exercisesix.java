class animal{
    String name;
    int age;

    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class dog extends animal{
    String breed;
    void makeSound(){
        System.out.println("Dog Barks");
    }
    void fetch(){
        System.out.println("Dog is fetching");
    }
}

class cat extends animal{
    String color;
    void makeSound(){
        System.out.println("cat meows");
    }
    void climb(){
        System.out.println("cat is climbing");
    }
}

public class exercisesix {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.name = "Timmy";
        d1.age = 2;
        d1.breed = "greman";
        d1.makeSound();
        d1.fetch();

        cat c1 = new cat();
        c1.name = "Tom";
        c1.age = 6;
        c1.color = "Black";
        c1.makeSound();
        c1.climb();
    }
}
