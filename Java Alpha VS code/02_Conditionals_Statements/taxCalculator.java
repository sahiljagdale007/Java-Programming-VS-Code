
import java.util.*;

public class taxCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int income = sc.nextInt();

            if (income <= 500000) {
                System.out.println("No tax for this income bracket");
            } else if (income >= 1000000) {
                System.out.println("Tax for this income brcket is:" + income * 0.2);
            } else {
                System.out.println("Tax for this income bracket is:" + income * 0.3);
            }
        }
    }
}
