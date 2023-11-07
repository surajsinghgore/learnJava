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

public class Program18 {
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        Dog d = new Dog();
        d.bark();
        d.eat();

    }
}
