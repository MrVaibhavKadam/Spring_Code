package singleton;

public class Printer {

    private static Printer INSTANCE;// 1

    //Private Constructor --2
    private Printer(){
        System.out.println("Printer 0-param constructor..!");
    }

    //public static factory method --3
    public static Printer getInstance(){

        if (INSTANCE == null)
            INSTANCE = new Printer();

        return INSTANCE;
    }

    //B. Method
    public void print(String msg){
        System.out.println(msg);
    }

}
