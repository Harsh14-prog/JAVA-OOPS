package superConstr;

class parent {
    String name = "harshad";
}

class child extends parent {

    String name = "Om";

    void showName(){
        System.out.println(name);
        System.out.println( super.name);
    }
}

public class first {

    public static void main(String[] args) {
        child p = new child();
        p.showName();
    }
}
