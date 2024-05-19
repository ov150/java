class underscore{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

class damm extends underscore{
    public int multi(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
    public int add(int n1, int n2){
        return (2*(n1 + n2));
    }
}
public class Main {
    public static void main(String[] args) {
        // underscore underscore = new underscore();
        // int sum = underscore.add(10, 10);
        // System.out.println(sum);
        damm obj = new damm();
        int add = obj.add(10, 10);
        System.out.println("addition : "+add);
        int sub = obj.sub(10, 10);
        System.out.println("subtraction : "+sub);
        int mul = obj.multi(10, 10);
        System.out.println("multiplication : "+ mul);
        int div = obj.div(10, 10);
        System.out.println("divition : "+div);
    }
    
}