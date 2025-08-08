public class staticVariable {

    public static class counter {

        public static int count = 0 ;
        String name ;
        
        counter(String name) {
           this.name = name ; 
           count++ ;
        }
    }
   public static void main(String[] args) {
      counter c1 = new counter("harshad");
      counter c2 = new counter("harsh");

      System.out.println(counter.count);

   } 
}

// class Employee {
//     static String companyName = "OpenAI"; // common to all employees
//     String name;

//     Employee(String name) {
//         this.name = name;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Employee e1 = new Employee("Alice");
//         Employee e2 = new Employee("Bob");

//         System.out.println(e1.companyName); // OpenAI
//         System.out.println(e2.companyName); // OpenAI
//     }
// }

