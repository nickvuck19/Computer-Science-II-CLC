import java.util.Scanner;
// Nick Vuckovic
// 6/16/2022
//Rectangle for Test0

public class Shape
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows:    ");
        rows = keyboard.nextInt();

        System.out.println("Enter # of columns:    ");
        columns = keyboard.nextInt();

        System.out.println("Enter symbol to use:  ");
        symbol = keyboard.next();
        for(int i=1;i<=rows;i++)
        {
            System.out.println();
            for(int j=1;j<=columns;j++)
            {
                System.out.print(symbol);
            }
        }
    }
}
