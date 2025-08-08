public class overloadMain {

    public static void main(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("i am harshad");
        main(20);  // calling overloaded main
    }
}
