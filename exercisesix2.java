class vehicle{
    String brand;
    int year;

    void startEngine(){

    }
}

class car extends vehicle{
    String fueltype;

    void startEngine(){
        System.out.println("car engine starts");
    }
    void drive(){
        System.out.println("car is driving");
    }
}

class truck extends vehicle{
    int loadCapacity;

    void startEngine(){
        System.out.println("Truck engine starts");
    }
    void haul(){
        System.out.println("truck is hauling");
    }
}

public class exercisesix2 {
    public static void main(String args[]){
        car c1 = new car();
        c1.brand = "Bugatti";
        c1.year = 2023;
        c1.startEngine();
        c1.fueltype = "petrol";
        c1.drive();

        truck t1 = new truck();
        t1.brand = "Mahendra";
        t1.year = 2020;
        t1.loadCapacity = 42;
        t1.startEngine();
        t1.haul();
    }
}
