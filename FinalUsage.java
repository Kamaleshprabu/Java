class Class1{
    final int num = 10;
//  num = 20;   Final Variable Cannot be Modify!!!

    void display(){
        System.out.println(num);
    }
}

class Class2{
    final void display(){
        System.out.println("I'm Final Method");
    }
}

class Class3 extends Class2{
/*  void display(){
        System.out.println("i'm Override Method");
    }    
         Final Method Cannot be OverRide!!!
    */
}

final class Class4{
    void display(){
        System.out.println("I'm Final Class");
    }
}

/*
class Class5 extends Class4{

} 
    Final Class cannot be inherite!!!
*/

public class FinalUsage {
    
}
