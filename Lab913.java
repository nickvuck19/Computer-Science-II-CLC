import java.util.Scanner;


//Nick Vuckovic
// 7/3/2022
// Lab 9.13 RecursiveValue

public class Lab913
{
    public static int productOf(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        else
        {
            return n * productOf(n-1);
        }
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer for n: ");
        int n = keyboard.nextInt();
        System.out.println("The product of integers from 1 to " + n + " is " + productOf(n));
    }
}
