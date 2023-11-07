class Animal {
    void eat() {
        System.out.println("Eating ...");
    }
}

class Dog extends Animal {
    void speed() {
        System.out.println("Dog Speed is Medium");
    }
}

class Cat extends Animal {
    void speed() {
        System.out.println("Cat Speed is Slow");
    }
}

class Horse extends Animal {
    void speed() {
        System.out.println("Horse Speed is Fast");
    }
}

public class Program20{
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance");
        Dog d = new Dog();
       d.eat(); d.speed();
        
        Cat c = new Cat();
       c.eat(); c.speed();
        
        Horse h= new Horse();
       h.eat(); h.speed();
        

    }
}
