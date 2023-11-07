class Animal {
    void eat() {
        System.out.println("Eating ...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking ...");
    }
}
class BabyDog extends Dog{
void weep(){
    System.out.println("weeping ...");
}
}
public class Program19{
    public static void main(String[] args) {
        System.out.println("Multi Level Inheritance");
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();

    }
}
