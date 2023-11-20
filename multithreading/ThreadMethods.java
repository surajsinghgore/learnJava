
class MyThread1 extends Thread {
    MyThread1(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("name of thread 1 = " + this.getName());
                sleep(200);
            }
        } catch (Exception e) {

            System.out.println(e);
        }

    }
}

class MyThread2 extends Thread {
    MyThread2(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("name of thread 2 = " + this.getName());
                sleep(200);
            }
        } catch (Exception e) {

            System.out.println(e);
        }

    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1("suraj");
        MyThread2 obj2 = new MyThread2("suraj");
        // join() method
        obj1.start();
        try {

            obj1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        obj2.start();
    }

}
