

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Thread 1 " + i);
        }
    }
}
class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Thread 2 " + i);
        }
    }
}

 public class UsingClass {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread();
        MyThread1 obj2 = new MyThread1();
        obj1.start();
        obj2.start();
    }
}
