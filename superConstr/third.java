package superConstr;

 class parent {
    parent(String msg) {
        System.out.println("Parent constructor: " + msg);
    }
}

class Child extends parent {
    Child() {
        super("Hello from Child"); // calls Parent constructor with argument
        System.out.println("Child constructor");
    }
}

public class third {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
 
