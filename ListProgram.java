import java.util.List;
import java.util.ArrayList;

//Nick Vuckovic
// 6/30/2022
// Program 10 Lists

public class ListProgram
{
    public static void main(String[] args)
    {
        //#1

        List<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add(1, "one");
        list1.add(1, "two");
        list1.add(1, "three");
        list1.add(1, "four");

        for(int i = 0; i<list1.size(); i++)
        {
            System.out.println(list1.get(i));
        }

        //#7

        System.out.println("List:   " + list1);

        System.out.println("The position of given object in myList:     " + list1.indexOf("B"));
    }
}

//#1 Output:
//A
//four
//three
//two
//one
//B
//C
//D


//#7 Output:
// 5
