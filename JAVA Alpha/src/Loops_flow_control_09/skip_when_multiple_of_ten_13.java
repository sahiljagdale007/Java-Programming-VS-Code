package Loops_flow_control_09;

import java.util.*;

public class skip_when_multiple_of_ten_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was: " + n);
        } while (true);
    }
}
