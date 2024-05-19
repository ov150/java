class staticFunctions{
    static void anotherClassFunction(){
        System.out.println("with in static and another class function");
    }
    public void anotherClassPublicFunction(){
        System.out.println("public within another class");
    }
}

public class Function {
    public static void main(String[] args) {
        staticFunctions.anotherClassFunction();
        staticFunctions obj = new staticFunctions();
        obj.anotherClassPublicFunction();
        underscore undescoreObj = new underscore();
        undescoreObj.Sound();
    }
}
