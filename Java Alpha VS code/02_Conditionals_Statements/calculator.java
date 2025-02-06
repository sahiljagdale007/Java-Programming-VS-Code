import java.util.*;

public class calculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter the operation which you want to perform: ");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                System.out.println("The addition of given number is :" + (a + b));
                break;
            case '-':
                System.out.println("The subtraction of given number is :" + (a - b));
                break;
            case '/':
                System.out.println("The division of given number is :" + (a / b));
                break;
            case '*':
                System.out.println("The multiplication of given number is:" + (a * b));
                break;
            case '%':
                System.out.println("The remainder of the given number is:" + (a % b));
                break;
               }
            
            }
        }
    }
