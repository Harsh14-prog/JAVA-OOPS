package AccessModifier.TestDiffPackage;   // created this folder(pack) to text access modifire in diff pack
import AccessModifier.Parent;

public class child extends Parent {
    public void test() {
        System.out.println(pub);       // public accessible anywhere just import class in any pack
        System.out.println(prot);      // protected accessible via inheritance
        // System.out.println(def);    // default not accessible , it is pack private
        // System.out.println(priv);   // private not accessible
    }

    public static void main(String[] args) {
        child c = new child();
        c.test();
    }
}

