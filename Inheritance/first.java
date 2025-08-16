package Inheritance;

abstract class Animal {
   
    // abstract method (method w/o body)
    abstract void speak();

    // concrete method
    void voice(){
        System.out.println("very pleasant");
    }
}

class dog extends Animal {

    @Override
    void speak(){
        System.out.println("dog is barking");
    }
}

public class first {
  
    public static void main(String[] args) {
        
        Animal a = new dog() ;
        a.speak();
        a.voice();
    }
}
