public class staticusage {
    static String laptop = "Hp";

    //Static Block
    static{
        System.out.println(staticusage.laptop); //Static variable accessed by class name 
    }

    public static void main(String[] args) {
        staticusage suba = new staticusage();
        suba.laptop = "Dell"; //Static variable should be accessed by class name rathen than object
        System.out.println(suba.laptop);

        staticusage kamal = new staticusage();
        kamal.laptop = "Msi"; //Static variable should be accessed by class name rathen than object

        System.out.println(suba.laptop);
        System.out.println(kamal.laptop);

        System.out.println(staticusage.laptop); //Static variable accessed by class name
        System.out.println(laptop); //Static variable can accessed directly only in static members
        //Accsessing static values using class name is best pratices
    }
}
