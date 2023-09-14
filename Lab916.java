// Nick Vuckovic
// 7/5/2022
//Lab 9.15, segment 9.16



public class Lab916
{
    public static void displayArray(int array[], int first, int last)
    {
        System.out.print(array[first] + " ");
        if(first<last)
            displayArray(array, first + 1, last);

    }

    public static void main(String[] args)
    {
        int[] a = {10,20,30,40,50,60,70,80};



        displayArray(a,0,7);

    }
}
