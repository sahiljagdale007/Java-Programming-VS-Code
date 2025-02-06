
import java.util.*;

public class AreaOfCircle {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            float pie = 3.1415f;                 //we are using here f for telling it is a float and it is not a double, our compiler automatically detect it as a double
            int radius = sc.nextInt();
            float Area = radius * radius * pie;
            System.out.println(Area); 
        }
    }
}
