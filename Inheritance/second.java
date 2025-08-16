package Inheritance;

interface vehicle {

    void start(); // public abstract methods bydefault
    void stop();

// Contract of the interface :
// An interface is a contract that promises:
// "Any class implementing me must provide a public implementation so that everyone can use it."

    default void fuel(){   // default method
      System.out.println("Refueling...");
    }

    static void service(){  // static method
       System.out.println("Vehicle servicing...");
    }
} 

class car implements vehicle{
   
    public void start(){
        System.out.println("Car starting...");
    }

    public void stop(){
        System.out.println("Car stopping...");
    }
}

public class second {
    public static void main(String[] args) {
        vehicle v = new car();
        v.start();
        v.stop();
        v.fuel();
        vehicle.service();
    }
}
