/**
 * oop1
 */
class A {

    int x, y;

    public void getXY() {
        System.out.println("CLASS A " + x + " " + y);
    }

}

/**
 * B
 */
class B extends A {

    int z;

    public void getXY() {
        System.out.println("CLASS B " + x + " " + y);
    }
}

/**
 * C
 */
class C extends A {
    int x;

    C(int a, int b) {
        super.x = a;
        x = b;
    }

    void show() {
        System.out.println("A x: " + super.x + " \nC x: " + x);
    }

}

/**
 * oop1
 */
public class oop1 {

    public static void main(String[] args) {
        A meow = new A();
        B meow2 = new B();

        meow.x = 77;
        meow.y = 88;

        meow2.x = 11;
        meow2.y = 22;
        meow.getXY();
        meow2.getXY();

        C meow3 = new C(66, 55);
        meow3.show();

    }

}