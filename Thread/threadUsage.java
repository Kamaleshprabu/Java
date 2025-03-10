package Thread;

//Threads are used to run multiple tasks at the same time

//To create Thread, We should extend the Thread Class
class A extends Thread{

    //Every Thread Should contains [public void run()] function
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Hey Hello...");
//            try {
//                Thread.sleep(10);  //Thread.sleep(10) Used to stop the execution for 10 milliseconds.
                //Usually it could throws an exception so we need try&Catch block
                
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

class B extends Thread{

    //Every Thread Should contains [public void run()] function
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Okey Bye...");
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        }
    }
}

public class threadUsage {
    public static void main(String[] args) {
        A A1 = new A();
        B B1 = new B();

        A1.start();
        B1.start();

        A1.setPriority(10);  //We can also set a priority to a thread, More number = More Priority
        B1.setPriority(5);

        A1.start();
        B1.start();
    }
}
