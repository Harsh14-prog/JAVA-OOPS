package constructor ;

public class constrOverload {
    String name;
    int age;

    // Constructor 1 - No parameters
    constrOverload() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2 - One parameter
    constrOverload(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3 - Two parameters
    constrOverload(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        constrOverload s1 = new constrOverload();              // Calls Constructor 1
        constrOverload s2 = new constrOverload("Harshad");     // Calls Constructor 2
        constrOverload s3 = new constrOverload("Amit", 22);    // Calls Constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}
