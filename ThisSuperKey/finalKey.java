class another {
    public void undo(){
        System.out.println("undo");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

public class finalKey {
    public static void main(String[] args) {
        final int num = 10;
        System.out.println("final variable value is : "+ num);
        another obj = new another();
        obj.add(4,5);
        obj.undo();

    }
}
