package Loops_flow_control_09;

import java.util.*;

public class print_one_to_n_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.println(count);
            count++;
        }
    }
}
