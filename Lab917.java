public class Lab917
{
    public static void displayArray(int array[], int first, int last)
    {
        if(first <= last)
        {
            displayArray(array, first, last - 1);
            System.out.print(array[last] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] a = {10,20,30,40,50,60,70,80};

        displayArray(a,0,7);
    }
}
