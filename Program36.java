import java.lang.Thread;
class JavaThread extends Thread{
    public void run(){
        try {
            for (int i = 0; i <=10; i++) {
                System.out.println("From Thread "+getName()+" "+i+" time");
                sleep(1000);
            }
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
    }
}
public class Program36 {
public static void main(String[] args) {
    JavaThread obj=new JavaThread();
    obj.start();
    JavaThread obj2=new JavaThread();
    obj2.start();

}
    
}