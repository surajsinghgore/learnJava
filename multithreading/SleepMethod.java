
class MyThread1 extends Thread {
    MyThread1(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("name of thread 1 = " + this.getName() + " Id Of Thread = " + this.getId());
                sleep(1000);
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
                System.out.println("name of thread 2 = " + this.getName() + " Id Of Thread = " + this.getId());
                sleep(1000);
            }
        } catch (Exception e) {

            System.out.println(e);
        }

    }
}

public class SleepMethod {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1("suraj");
        obj1.start();
        MyThread2 obj2 = new MyThread2("test");
        obj2.start();
    }
}
