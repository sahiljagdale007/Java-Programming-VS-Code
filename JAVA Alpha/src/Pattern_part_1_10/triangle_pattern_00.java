package Pattern_part_1_10;

import java.sql.SQLOutput;
import java.util.*;

public class triangle_pattern_00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }

    }
}
