class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("thread of 1");
        }

    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Thread of 2");
        }
    }

}

public class UsingRunnable {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        Thread t1 = new Thread(obj1);

        MyThread2 obj2 = new MyThread2();
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
