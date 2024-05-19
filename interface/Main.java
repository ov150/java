interface Animal{
    public void Sound();
    public void sleep();
    int a = 10;
}
interface Lion extends Animal{
    public void run();
}

class underscore implements Lion{
    public void Sound(){
        System.out.println("barking...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
    public void run(){
        System.out.println("Running...");
    }
}
public class Main {
    public static void main(String[] args) {
        underscore obj = new underscore();
        obj.Sound();
        obj.sleep();
        obj.run();
        System.out.println(Animal.a);
        // underscore.Sound();
        // underscore.sleep();
    }
}

