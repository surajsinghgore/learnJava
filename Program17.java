public class Program17 {
    public int cal(int x){return x;}
    public int cal(int x,int y){return (x+y);}
    public int cal(int x,int y,int z){return (x+y+z);}
 public static void main(String[] args) {
    Program17 obj=new Program17();
    System.out.println("Method Overloading");
    System.out.println(obj.cal(10));
    System.out.println(obj.cal(20,30));
    System.out.println(obj.cal(10,30,60));
 }   
}
