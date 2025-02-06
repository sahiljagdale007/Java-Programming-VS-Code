import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();

        if(a%2==0) {
            System.out.println("Given number is even");
        }else {
            System.out.println("Give number is odd");
        }
      }
    }
}
