package constructor;

public class constrChaining {
    String name;
    int age;
    String department;

    // Constructor 1
    constrChaining() {
        this("Unknown", 0);  // Calls Constructor 2
        System.out.println("Default constructor called");
    }

    // Constructor 2
    constrChaining(String name, int age) {
        this(name, age, "Not Assigned");  // Calls Constructor 3
        System.out.println("Constructor with name and age called");
    }

    // Constructor 3
    constrChaining(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.department = dept;
        System.out.println("Constructor with all details called");
    }

    void display() {
        System.out.println(name + " - " + age + " - " + department);
    }

    public static void main(String[] args) {
        constrChaining e1 = new constrChaining();
        e1.display();
    }
}

