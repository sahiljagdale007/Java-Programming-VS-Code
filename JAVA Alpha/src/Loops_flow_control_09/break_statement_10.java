package Loops_flow_control_09;

public class break_statement_10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }
}
