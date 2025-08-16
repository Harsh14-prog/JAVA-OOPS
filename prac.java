public class prac {

    String name ;
    int age ;

    prac(String name , int age){
       this.name = name ;
       this.age = age ;
    }

    prac(prac obj){
        this.name = obj.name ;
        this.age = obj.age ;
    }

    public void display(){
       System.out.println("Name: " + name + ", Age: " + age);
    }

   public static void main(String[] args) {
      prac obj = new prac("harsh" , 18);
      prac copy = new prac(obj);

      copy.display();
   } 
}
