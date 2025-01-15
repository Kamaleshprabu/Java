//Abstract Class
abstract class vehicle{

    //Abstract method - It is used when every drived classes should override the method
    //Abstract methods are only used in abstract class
    abstract void speed();  //Abstract methods should not have BODY

    void brand(){
        System.out.println("BMW");
    }
}

class bike extends vehicle{

    //Every derived classes should implement the Abstract Method
    void speed(){
        System.out.println("This is Abstract");
    }
}

class cycle extends vehicle{

    //Every derived classes should implement the Abstract Method
    void speed(){
        System.out.println("This is Abstract");
    }
}

public class abstractusage{
    public static void main(String[] args) {
        bike b = new bike();
        b.speed();

        cycle c = new cycle();
        c.speed();
    }
}
