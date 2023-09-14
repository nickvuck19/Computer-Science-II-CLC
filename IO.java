package week1;

import java.util.Scanner;
import java.util.Random;

//Nick Vuckovic
// 6/6/2022
//Write a program using simple I/O


public class IO
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int x;
        int y;

        System.out.println("Enter your lucky number:   ");
        x = keyboard.nextInt();

        y = random.nextInt(1,99);

        System.out.println("Your lucky number:" + x + " " +  "Your secret number:   " + y);
    }//end main
}//end IO
