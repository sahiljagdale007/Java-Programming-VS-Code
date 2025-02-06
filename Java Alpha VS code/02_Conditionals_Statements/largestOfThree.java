
import java.util.*;

public class largestOfThree {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a >= b && a >= c) {
                System.out.println("a is greates of three numbers!");
            } else if (b>=c) {
                System.out.println("b is greates of three numbers!");
            } else {
                System.out.println("c is greatest of three numbers");
            }
        }
    }
}
