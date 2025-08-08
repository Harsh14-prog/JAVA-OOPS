package constructor;

public class AllConcept {
    String brand;
    int year;

    // Default Constructor
    AllConcept() {
        this("Unknown", 0); // Constructor chaining
        System.out.println("Default AllConcept Constructor");
    }

    // Parameterized Constructor
    AllConcept(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Copy Constructor
    AllConcept(AllConcept v) {
        this.brand = v.brand;
        this.year = v.year;
    }

    void display() {
        System.out.println(brand + " - " + year);
    }

      public static void main(String[] args) {
        AllConcept v1 = new AllConcept();
        AllConcept v2 = new AllConcept("Tesla", 2025);
        AllConcept v3 = new AllConcept(v2); // Copy constructor

        v1.display();
        v2.display();
        v3.display();
    }
}




