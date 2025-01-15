public class nestedforloop {
    public static void main(String args[]){

        //Exercise-1
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                System.out.println("Teacher "+ (i + 1) + ": JOhn");
            }
        }

        //Exercise-2
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        //Exercise-2 -> Another Way
        for(int i = 0; i < 3; i++){
            System.out.println("#".repeat(3));
        }

        //Exercise-3
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
