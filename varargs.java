public class varargs {

    public static void sum(int a , String ... st) {
       System.out.println(a);
       
       for (String s : st){
        System.out.println(s);
       }
    }
    public static void main(String[] args) {
        sum (10 , "harsh" , "khambe" , "anil");
    }
}
