package Encapsulation;

public final class ImmutableStudent {
    private final String name;
    private final int age;

    // Constructor name must match class name
    public ImmutableStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }

    public static void main(String[] args) {

        ImmutableStudent s = new ImmutableStudent("Harshad", 18);
        System.out.println(s.getName()); 
        System.out.println(s.getAge());  // You can read values but cannot change them.
        // This is full encapsulation + immutability.
        // eg : in java String, Integer, LocalDate

        // s.name = "John";  Error: name is private and final
        // s.setAge(20);     No setter exists
    }
}
