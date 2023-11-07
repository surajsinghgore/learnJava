interface walkable{

    void walk();
}

interface swimming{
    void swim();
}

class Duck implements walkable,swimming{

    public void walk(){
        System.out.println("Duck is walking");
    }
    public void swim(){
        System.out.println("Duck is swimming");
    }
}

public class Program33 {
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance Through Interface");
        Duck obj=new Duck();
        obj.walk();
        obj.swim();
    }
}
