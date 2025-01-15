public class methodoverload {
    void display(){
        System.out.println("one");
    }
    void display(int a){
        System.out.println(a);
    }

    void sum(int a, int b){
        System.out.println(a + b);
    }
    void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String args[]){
        methodoverload obj = new methodoverload();
        obj.display();
        obj.display(10);

        obj.sum(10, 5);
        obj.sum(10, 5, 20);
    }
}
