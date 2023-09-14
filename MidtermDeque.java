import java.util.Deque;
import java.util.ArrayDeque;
//Nick Vuckovic
// 7/7/2022
//Midterm Deque


public class MidtermDeque
{
    public static void main(String[] args)
    {
        Deque<String> d0 = new ArrayDeque<>();

        d0.offerFirst("Jim");
        d0.offerFirst("Jess");
        d0.offerLast("Jill");
        d0.offerLast("Jane");
        String name = d0.pollFirst();
        d0.offerLast(name);
        d0.offerLast(d0.peekFirst());
        d0.offerFirst(d0.pollLast());

        System.out.println("The contents of the deque are:  " + d0);

    }
}
