package Loops_flow_control_09;

import java.util.*;

public class print_sum_of_first_n_numbers_04 {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int count = 1;

        while (count <= n) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}
