// Nick Vuckovic
// 7/3/2022
// Lab 9.3

//Counts down from a given positive integer.



public class Lab93CountDown
{
    public static void countDown(int integer)
    {
        System.out.println(integer);
        if(integer > 1)
            countDown(integer - 1);
    }

    public static void main(String[] args)
    {
        countDown(5);
    }
}
