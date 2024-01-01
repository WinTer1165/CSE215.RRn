class A {
    int r;

}

class B extends A {

    

    void setparam(int r) {
        super.r = r * r;
        r = super.r * 2;
        System.out.println("r from a: " + super.r + "\nr from B: " + r);
    }
}

public class oop9 {
    public static void main(String[] args) {

        B b = new B();
        b.setparam(5);

    }
}
