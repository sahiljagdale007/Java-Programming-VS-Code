
import java.util.*;

public class passFail {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int marks = sc.nextInt();

            String status = (marks >= 33) ? "PASS" : "FAIL";
            System.out.println(status);
        }
    }
}
