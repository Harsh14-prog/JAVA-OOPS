package AccessModifier;    // using under same package

public class TestSamePackage {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showPublic();
        p.showProtected();
        p.showDefault();
        // p.showPrivate();   only accessible inside it's class , not acc. even in same pack
    }
}
