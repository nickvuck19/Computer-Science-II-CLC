public class Lab918
{
    public static void displayArray(int[] array, int first, int last)
    {
        if(first == last)
            System.out.print(array[first] + " ");
        else
        {
            int mid = (first + last) / 2;
            displayArray(array, first, mid);
            displayArray(array, mid + 1, last);
        }
    }

    public static void main(String[] args)
    {
        int[] a = {10,20,30,40,50,60,70,80};

        displayArray(a,0,7);
    }
}
