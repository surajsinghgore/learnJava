public class Program3 {
    static int A=10;//static variable , class variable
    int B=20;//Instance variable
 public static void main(String[] args) {
    int C=30;//local variable
    System.out.println("Local Variable = "+C);
    System.out.println("Class Variable = "+Program3.A);
    Program3 obj=new Program3();
    System.out.println("Instance Variable = "+obj.B);

 }   
}
