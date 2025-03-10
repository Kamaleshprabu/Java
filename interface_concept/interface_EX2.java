package interface_concept;

interface Readable{
    void read();
}

interface Writable{
    void write();
}

interface Storable{
    void store();
}

class File implements Readable, Writable, Storable{
    public void read(){
        System.out.println("Readable");
    }
    public void write(){
        System.out.println("writable");
    }
    public void store(){
        System.out.println("storable");
    }
}

public class interface_EX2 {
    public static void main(String[] args) {
        File F = new File();
        F.read();
        F.write();
        F.store();
    }
}
