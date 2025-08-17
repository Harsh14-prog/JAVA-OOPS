package AccessModifier;   // package-1

public class Parent {
    public int pub = 10;
    protected int prot = 20;
    int def = 30;   // default
    private int priv = 40;

    public void showPublic() {
        System.out.println("Public: " + pub);
    }

    protected void showProtected() {
        System.out.println("Protected: " + prot);
    }

    void showDefault() {
        System.out.println("Default: " + def);
    }

    private void showPrivate() {
        System.out.println("Private: " + priv);
    }
}
