// Nick Vuckovic
// 6/20/2022
// Lab 1 BagQuestions

import java.util.Arrays;

public class Lab1Bag {
  public static void main( String[] args ) {
    BagInterface<String> aBag = new ArrayBag<>( 3 );    // full bag = 3;
    //Question #1
    //n=3
    // add "Hello"
    // add "World"
    //add "mcs142 cs2"
    //add "full bag"
    //when n=3 then the bag becomes full

    //Question #2- yes, it is legal because the method would just be overriding

    //Question #3- yes, these methods would be considered overloaded



    aBag.add( "Hello" );     // Question#4
    aBag.add( "World" );
    aBag.add( "mcs142 cs2" );
    aBag.add( "full bag" );

    //Question #4
    //To remove strings:
    //clear aBag, clears the whole array
    //To display Strings:
    //create new array Items[]b=aBag.toArray();
    //the use method Arrays.toString(b);



    System.out.println( "#4." );
    while( !aBag.isEmpty() )     
      System.out.println( "  " + aBag.remove() );
    
    aBag.add( "Hello" );     // Question#5
    aBag.add( "World" );
    aBag.add( "mcs142 cs2" );
    aBag.add( "full bag" );

    //Question #5
    //int count = aBag.getFrequencyOf("Hello");
    //output= 1
    
    int count = aBag.getFrequencyOf( "Hello" );
    System.out.println( "#5. count \"Hello\" = " + count );
    
    aBag.add( "Hello" );     // Question#6
    aBag.add( "World" );
    aBag.add( "mcs142 cs2" );
    Object[] a = aBag.toArray();

    //#6 seems to be done already, but I would write the for loop used below since that is what I
    //am most familiar with

    System.out.print( "#6. aBag = " );
    //for( i = 0; i < a.length(); i++ )
    //   System.out.println( a[i] );
    System.out.println( Arrays.toString( a ) );     // this is nicer than for() loop.
  }
}