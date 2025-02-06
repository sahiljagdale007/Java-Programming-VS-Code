package Loops_flow_control_09;

public class continue_statement_12 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            if(i==3){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
