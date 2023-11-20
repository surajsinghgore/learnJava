class MyThread1 extends Thread {
   MyThread1(String name){
    super(name);
   }

   public void run(){
    System.out.println("name of thread 1 = "+this.getName()+" Id Of Thread = "+this.getId());
   }
}


class MyThread2 extends Thread {
   MyThread2(String name){
    super(name);
   }

   public void run(){
    System.out.println("name of thread2 = "+this.getName()+" Id Of Thread = "+this.getId());
   }
}
public class SetAndGetThreadName {
    public static void main(String[] args) {
        MyThread1 obj1=new MyThread1("suraj");
        obj1.start();
        MyThread2 obj2=new MyThread2("test");
        obj2.start();
    }
}
