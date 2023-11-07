abstract class Bike{
    abstract void run();
}
public class Program25 extends Bike{
    void run(){
        System.out.println("Running Safely");
    }

    public static void main(String[] args) {
        Program25 obj=new Program25();
        System.out.println("Abstract Class");
        obj.run();
    }
}



