import java.util.PriorityQueue;

//Nick Vuckovic
// 7/7/2022
//Midterm PriorityQueue


public class MidtermPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<String> pq0 = new PriorityQueue<>();   // import java.util.PriorityQueue;

        pq0.add("Jim");
        pq0.add("Jess");
        pq0.add("Jill");
        pq0.add("Jane");

        String name = pq0.remove();
        pq0.add(name);
        pq0.add(pq0.peek());
        pq0.add("Jim");
        pq0.remove();

        System.out.println("The contents of the priority queue are: " + pq0);
    }
}
