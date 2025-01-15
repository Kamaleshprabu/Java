//Single Level

import java.text.NumberFormat.Style;

class dad{
    int money = 10000;
}

class son extends dad{
    int pocket = money * 10/100;
}

//Multi Level
class college{
    String clg_name = "Siga";
}

class department extends college{
    String dept_name = "BCA";
}

class student extends department{
    String stu_name = "Kamal";
}

//hierarchical
class grass{
    String food = "grass";
}

class cow extends grass{
    String ani_name = "cow";
}

class goat extends grass{
    String ani_name = "goat";
}

//Hybrid
class calf extends cow{
    String ani_name = "calf";
}
//grass is iheritated by cow and goat (hierarchical), The cow is inheritated by calf is called hybrid (Multi level).
//cobination of inheritance is called Hybrid

public class inheritance {
    public static void main(String[] args) {

        //Single
        son s1 = new son();
        System.out.println(s1.money);
        System.out.println(s1.pocket);

        //Multi
        student stu = new student();
        System.out.println(stu.stu_name + " is a " + stu.dept_name + " student in " + stu.clg_name);

        //hierarchical
        cow c = new cow();
        goat g = new goat();
        System.out.println(c.ani_name + " eats " + c.food);
        System.out.println(g.ani_name + " eats " + g.food);

        //Hybrid
        calf cf = new calf();
        System.out.println(cf.ani_name+ " eats " + cf.food);
    }
}
