
import java.util.Scanner;

public class productOfaAndb {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int product = a * b;
            System.out.print(product);
        }
    }
}
