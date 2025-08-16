package Inheritance ;

interface A {
    default void sayHello() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void sayHello() {
        System.out.println("Hello from B");
    }
}

class D implements A, B {
    @Override
    public void sayHello() {
        // must resolve explicitly
        A.super.sayHello();  // or B.super.sayHello();
        System.out.println("Hello from D");
    }
}

public class third {
    public static void main(String[] args) {
        D obj = new D();
        obj.sayHello();
    }
}
