package Loops_flow_control_09;

import java.util.*;

public class exit_when_multiple_of_ten_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
