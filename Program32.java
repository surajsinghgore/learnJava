
 interface MyInterface {
static final int num=20;
void display();
}

class SubInterface implements MyInterface{
int Roll=201;
public void display(){
    System.out.println("Num = "+num);
    System.out.println("Roll = "+Roll);
}

}
public class Program32 {
    public static void main(String[] args) {
       SubInterface obj=new SubInterface();
       System.out.println("Interface In Java");
       obj.display(); 
    }
}
