package interface_concept;

interface Playable{
    void play();
}

class Guitar implements Playable{
    public void play(){
        System.out.println("I'm Guitar");
    }
}

class Piano implements Playable{
    public void play(){
        System.out.println("I'm Piano");
    }
}

public class Interface_EX1 {
    public static void main(String[] args) {
        Guitar G = new Guitar();
        G.play();

        Piano P = new Piano();
        P.play();
    }
}
