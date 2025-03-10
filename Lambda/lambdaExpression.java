package Lambda;

/*  Lambda Expression is denoted as [ ()-> ]
    Its is used to implement the body for a method (Abstract) in an interface
    This is applicable only for an inetrface with a Single method in it.
*/

interface ClassA{
    void display();
}

public class lambdaExpression {
    public static void main(String[] args) {

        //  Implementing the Body for the Method [ display() ] in Interface
        ClassA obj = ()-> { System.out.println("This is Display Method"); };

        /*
        
        Lambda actually creating a class that implements the interface 
        and override the single abstract methos in interface with the given body 
        
        It is applicable for an interface with only single method because of confusion,
        Fpr Example: If an interface with More than one Method in it 
                     Lambda will confusion to Which method to override and Implement the given body.

        */

        obj.display();

        //  obj is the object of the subclass that implements the interface
    }
}
