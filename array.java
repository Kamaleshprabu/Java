import java.util.*;
public class array {
    public static void main(String args[]){
        String[] playlist = new String[3];

        playlist[0] = "song1";
        playlist[1] = "song2";
        playlist[2] = "song3";

        System.out.println(playlist[0]);
        System.out.println(playlist[1]);
        System.out.println(playlist[2]);
        System.out.println(playlist);

        int[] num = new int[5];
        int sum = 0;

        for(int i = 0; i < num.length; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter value for " + i);
            num[i] = scan.nextInt();
            sum += num[i];
        }
        System.out.println(sum);

        String name = new String("kamalesh");
        System.out.println(name);
        String sis = "Suba";    }
}
