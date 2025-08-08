public class methodOverloading {

  public static class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2
    double add(double a, double b) {
        return a + b;
    }

    // Method 3
    int add(int a, int b, int c) {
        return a + b + c;
    }
  }
public static void main(String[] args) {
    
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));       // calls int version
        System.out.println(calc.add(5.5, 4.5));   // calls double version
        System.out.println(calc.add(1, 2, 3));    // calls 3-parameter version
    }
}


