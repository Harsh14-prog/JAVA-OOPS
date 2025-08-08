import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedRead {
   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("i am harshad khambe");
         String name = br.readLine();

         System.out.println(name);

      } catch (Exception e) {
          System.out.println("An error occurred while reading input.");
      }
   }
}
