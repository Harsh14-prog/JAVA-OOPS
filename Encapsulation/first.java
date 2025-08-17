package Encapsulation;

 class Student {
    // Step 1: Private variables
    private String name;
    private int age;

    // Step 2: Public setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {

        if (a > 0) {  // Validation
            age = a;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Step 2: Public getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class first {
    public static void main(String[] args) {
        Student s = new Student();
        
        s.setName("Harshad");
        s.setAge(18);
        
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        
        s.setAge(-5);  //  Invalid age, encapsulation prevents wrong data
    }
}
 
