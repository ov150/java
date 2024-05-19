class modifiers{
    private String name = "underscore";
    public void acess(){
        System.out.println(name);
    }
}

public class Main{
    public static void main(String[] args) {
        modifiers obj = new modifiers();
        obj.acess();
    }
}