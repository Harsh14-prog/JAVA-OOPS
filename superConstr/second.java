package superConstr;

class parent2 {
    void display(){
        System.out.println("display from parent");
    }
}

class child2 extends parent2 {
    void display(){
        super.display();
        System.out.println("display from child");
    }
}

public class second {
    public static void main(String[] args) {
        child2 c = new child2();
        c.display();
    }
}
