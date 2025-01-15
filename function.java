public class function {

    //outer class functions
    void iphone(){
        System.out.println("This is iphone");
    }

    void samsung(){
        System.out.println("This is samsung");
    }

    void oppo(){
        System.out.println("This is oppo");
    }

    void realme(){
        System.out.println("This is Realme");
    }

    //inner-class
    class addition {

        int a = 10;
        int b = 20;
        void add(){
            System.out.println(a + b);
        }
    }

    //Static function
    static void sum(){
        System.out.println(10 + 10 + 20 + 10);
    }

    //Static class
    static class garden {
    
        int apple_price = 20;
        int apple_count = 5;

        void total_money(){
            System.out.println("Total Money: " + apple_price * apple_count);
        }
    }

    //Static variable
    static String name = "Kamalesh";

    //outer variable
    int number = 12345;

    //This is for FUNCTION with PARAMETER
    void market(int money){
        if(money > 10){
            System.out.println("Soup Purchsed");
        }
    }

    void market2(int money){
        if(money > 10){
            System.out.println("Chocolet");
        }
    }

    void market3(int money){
        if(money > 20){
            System.out.println("Powder");
        }else{
            System.out.println("not enough money");
        }
    }

    void calSum(int num1, int num2){
        System.out.println(num1 + num2);
    }

    int getProduct(int money, String item)
    {
        int rem = 0;
        if(item.trim().toLowerCase().equals("soap"))
        {
            rem = 20 - money;
        }
        else if(item.trim().toLowerCase().equals("chocolate"))
        {
            System.out.println("Ordered Chocolate");
            rem = 10 - money;
        }
        return rem;
    }

    String name(String nam){
        return "Hello "+ nam;
    }

    public static void main(String args[]){

        //Calling function from outer class
        function fun = new function();
        fun.iphone();
        fun.samsung();
        fun.oppo();
        fun.realme();

        //Calling function from a class that inside the outer class
        function.addition addnum = fun.new addition();
        addnum.add();

        //Calling a static function
        sum();

        //Calling a function from a static class
        garden gar = new garden();
        gar.total_money();

        //Accessing A static variable
        System.out.println(name);

        //Accessing a outer class variable
        System.out.println(fun.number);

        //Accessing Function with Parameter
        fun.market(20);
        fun.market(10);
        fun.market3(30);
        fun.market3(10);

        fun.calSum(10, 10);
        
        int reminder = fun.getProduct(15, "chocolate");
        System.out.println(reminder);

        String result = fun.name("kamalesh");
        System.out.println(result);
    }
}
