// package JAVA2;
import java.util.*;
public class questionThird {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float pencil = sc.nextFloat();
            float pen = sc.nextFloat();
            float eraser = sc.nextFloat();
            float Total = pencil + pen + eraser;

            System.out.println("Bill of the all the item is:"+Total);

            float newTotal = Total + (0.18f * Total);
            System.out.println("The price of item after GST is:" + newTotal);
        }
    }
}
