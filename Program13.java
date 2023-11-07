class Student{
int rollNo;String name;
Student(int i,String n){
    rollNo=i;
    name=n;
}
void display(){
    System.out.println("RollNo = "+rollNo+" Name = "+name);
}
}
public class Program13 {
    public static void main(String[] args) {
        Student obj1=new Student(101, "suraj");
        System.out.println("Parameterized Constructor");
                Student obj2=new Student(102, "Rohan");
obj1.display();
obj2.display();
    }
}
