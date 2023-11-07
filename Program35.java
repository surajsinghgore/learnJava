import java.lang.Exception;

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}

public class Program35 {
    public static void main(String[] args) {
        String str="Bindra";
        try {
            if(!str.equals("indra")){
                throw new MyException("String Not Match");
            }
        } catch (Exception e) {

           System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Demo of user defined class is over");
        }
    }
}
