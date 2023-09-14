import java.util.Arrays;

//Put the first 1000 negative integers into an array
public class PC31
{
    public static void main(String[] args)
    {
        int[]array = new int[1000];
        for(int i=0;i<array.length;i++)
        {
            array[i]= -(i+1);
        }

        System.out.println(Arrays.toString(array));
    }
}
