package basics_00;

public class first_swap_two_numbers {
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;            //here we are swapping two numbers.........

        System.out.println(a);
        System.out.println(b);

    }
}
