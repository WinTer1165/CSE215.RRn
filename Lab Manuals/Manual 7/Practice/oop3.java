
class A {
    // A() {
    // System.out.println("Inside A's constructor.");
    // }

    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    // B() {
    // System.out.println("Inside B's constructor.");
    // }

    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends B {
    // C() {
    // System.out.println("Inside C's constructor.");
    // }

    void callme() {
        System.out.println("Inside C's callme method");
    }
}

public class oop3 {
    public static void main(String args[]) {
        A a = new A(); // object of type A
        B b = new B(); // object of type B
        C c = new C(); // object of type C
        
        A r;
        r = c;
        r.callme();

        r = a;
        r.callme();
        r = b;
        r.callme();

    }
}