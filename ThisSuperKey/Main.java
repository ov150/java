class A{
    public A(){
        System.out.println("in A");
    }
    public A(int a){
        System.out.println("int A");
    }
}
class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int a){
        super(a);
        System.out.println("int B");
    }
}

public class Main{
    public static void main(String[] args) {
        // super => call the constructor of super class
        B obj = new B(5);
    }
}
