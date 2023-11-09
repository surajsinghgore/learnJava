class JavaThread implements Runnable{

    public void run(){
        try {
            for (int i = 0; i <=10; i++) {
                System.out.println("Call number "+i);
                
            }
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
    }
}

public class Program37 {
    public static void main(String[] args) {
        JavaThread obj1=new JavaThread();
        Thread t1=new Thread(obj1);
        JavaThread obj2=new JavaThread();
        Thread t2=new Thread(obj2);
        System.out.println("Thread Runnable Interface");
        t1.start();
        t2.start();
    }
}
