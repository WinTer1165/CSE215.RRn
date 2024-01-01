
abstract class Animal {

    public abstract void eat();

    public abstract void color();

}

class Dog extends Animal {
    public void eat() {
        System.out.println("DOG EAT");
    }

    public void color() {
        System.out.println("DOG White");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("CAT EAT");
    }

    public void color() {
        System.out.println("Cat Black White");
    }
}

public class oop8 {
    public static void main(String[] args) {

        Dog d = new Dog();
        Animal a;
        a = d;
        a.eat();
        a.color();

    }
}
