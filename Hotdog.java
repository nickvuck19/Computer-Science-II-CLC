import java.util.Arrays;

//Nick Vuckovic
// 6/23/2022
// #1 Test 3



public class Hotdog
{
    public static void main(String[] args)
    {
        BagInterface <String> order1 = new ArrayBag<>();
        BagInterface <String> order2 = new ArrayBag<>();
        BagInterface <String> order3 = new ArrayBag<>();

        order1.add("1/2 lb hotdog");
        order1.add("fries");

        order2.add("2 ft. long hotdog");
        order2.add("fries");

        order3.add("hotdog and bratwurst combo");
        order3.add("fries");

        System.out.println(Arrays.toString(order1.toArray()));
        System.out.println(Arrays.toString(order2.toArray()));
        System.out.println(Arrays.toString(order3.toArray()));
    }
}
