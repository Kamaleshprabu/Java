public class thisusage {
    String name;

    thisusage(){
        System.out.println("Hello");
    }

    void hi(){
        System.out.println("hi");
    }

    void display(String name){

        //this represents the variable of the instance
        this.name = name;

        System.out.println(name);
    }

    class inner{
        String name;

        void display(String name){
            this.name = name;
            System.out.println(name);
        }
    }

    public static void main(String agrs[]){
        thisusage ths = new thisusage();
        ths.display("Kamal"); 

        //Object creation for inner class
        thisusage.inner inn = ths.new inner();
        inn.display("suba");
    }


}
