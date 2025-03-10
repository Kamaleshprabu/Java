package Exercise7;

abstract class Vehicle{
    final void startEngine(){
        System.out.println("Engine Started");
    }

    static String getVehicleType(){
        String type = "Generic Vehicle";
        return type;
    }

    abstract void drive();
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Drive Car");
    }
}

class MotorCycle extends Vehicle{
    void drive(){
        System.out.println("Drive MotorCycle");
    }
}

public class exercise7_p5 {
    public static void main(String[] args) {
        Car C = new Car();
        C.startEngine();
        Vehicle.getVehicleType();
        C.drive();

        MotorCycle MC = new MotorCycle();
        MC.startEngine();
        Vehicle.getVehicleType();
        MC.drive();
    }
}
