//Nick Vuckovic
// 6/28/2022
// Program 1 Generic Point



public class P1GenericPoint
{
    public static void main(String[] args)
    {
        Point<Integer> pair0 = new Point<>(1,2);
        Point<Double> pair1 = new Point<>(1.4,2.5);

        System.out.println("pair0 X:    " + pair0.getX());
        System.out.println("pair0 Y:    " + pair0.getY());
        System.out.println("pair0 point:    " + pair0.toString());

        System.out.println();

        System.out.println("pair1 X:    " + pair1.getX());
        System.out.println("pair1 Y:    " + pair1.getY());
        System.out.println("pair1 point:    " + pair1.toString());
    }
}
