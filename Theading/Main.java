class underscore extends Thread{
    public void run(){
        for (int index = 1; index <= 10; index++) {
            System.out.println("underscore");
        }
    }
}

class underscore_damm extends Thread{
    public void run(){
        for (int index = 1; index <= 10; index++) {
            System.out.println("underscore damm");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        underscore underscoreObj = new underscore();
        underscore_damm underscore_dammObj = new underscore_damm();

        // underscoreObj.show();
        // underscore_dammObj.show();
        underscoreObj.start();
        underscore_dammObj.start();

    }
}