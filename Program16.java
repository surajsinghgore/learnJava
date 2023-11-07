public class Program16 {
    public void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void main(String[] args) {
        int num = 20;
        System.out.println("Method In Java");
        Program16 obj = new Program16();
        obj.findEvenOdd(num);
    }
}
