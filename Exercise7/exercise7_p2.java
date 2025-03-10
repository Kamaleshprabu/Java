package Exercise7;

class Counter{
    static int count = 0;
    int instanceNumber = 0;

    Counter(){
        count++;
        instanceNumber++;
    }

    void display(){
        System.out.println(count);
        System.out.println(instanceNumber);
    }
}

public class exercise7_p2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.display();

        Counter c2 = new Counter();
        c2.display();

        Counter c3 = new Counter();
        c3.display();

        Counter c4 = new Counter();
        c4.display();
    }
}
