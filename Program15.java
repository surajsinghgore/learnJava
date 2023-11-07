class Student{
    int id;String name;int age;
    Student(int i,String n){
id=i;
name=n;
    }
    Student(int i,String n,int a){
id=i;
name=n;
age=a;
    }
void display(){
    System.out.println(id+" "+name+" "+age);
}
}
public class Program15 {
   public static void main(String[] args) {
    Student obj1=new Student(10, "suraj");
    Student obj2=new Student(11, "ram",55);
    obj1.display();
    obj2.display();
   } 
}
