package constructor;

public class defaultConstr {
    int x;
    // Compiler adds: defaultConstr() {}

    public static void main(String[] args) {
        defaultConstr d = new defaultConstr(); // Calls compiler-provided default constructor
        System.out.println(d.x); // 0
    }
}
