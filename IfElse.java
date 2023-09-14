package week1;



//Nick Vuckovic
// 6/8/2022
// Demonstrating the use of the If/Else statement

public class IfElse
{
    public static void main(String[] args)
    {
        int age = 16;

        if(age >= 70)
        {
            System.out.println("You are old.");
        }
        else if(age >= 18)
        {
            System.out.println("You are an adult.");
        }
        else if(age >= 13)
        {
            System.out.println("You are a teenager");
        }
        else
        {
            System.out.println("You are not an adult.");
        }
    }
}
