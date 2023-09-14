// Nick Vuckovic
// 7/3/2022
// Lab 9.3


public class Lab95CountDown
{
    public static void countDown(int integer)
    {
        if(integer == 1)
            System.out.println(integer);
        else
        {
            System.out.println(integer);
            countDown(integer - 1);
        }
    }

    public static void main(String[] args)
    {
        countDown(12);
    }
}
