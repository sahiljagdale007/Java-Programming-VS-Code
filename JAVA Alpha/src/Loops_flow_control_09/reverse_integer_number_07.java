package Loops_flow_control_09;

import java.util.*;

public class reverse_integer_number_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0) {
            int LastDigit = n % 10;               //From this we will get last digit of a integer
            System.out.print(LastDigit + " ");
            n = n / 10;                            //From this we will remove last digit of a integer
        }
    }
}
