// Mr. Reed
// 09/02/20
// Lab B.33 Enumerate



public class LabC17CollegeStudent {
  public static void main( String[] args ) {
    // #10. The two definitions of the constructors Student() and Student( Name(), id )
    //     overloading or overriding?
    // Answer: It is overloading because they both have the same name but different parameters
    Student s0 = new Student();     // default constructor
    System.out.println( "constructor Student() = " + s0 );
    Student s1 = new Student( new Name( "Nick", "Vuckovic" ), "12345" );
    System.out.println( "constructor Student(Name(), id ) = " + s1 );
    System.out.println( "#10.  Overloading?  Overriding?\n" );
    System.out.println("Overloading because they both have the same name but different parameters");
    
    // #11. Add the method setStudent( Name(), id ) to CollegeStudent.java
    //     with default values for int year and String degree.
    //     overloading or overriding?
    // Answer: Also overloading because they have the same name with different parameters
    CollegeStudent cs1 = new CollegeStudent( new Name("Nick","Vuckovic"), "12345", 2025, "B.S. Comp Sci"  );
    System.out.println( "CollegeStudent( Name(), id, year, degree ) = " + cs1 );
    Name n1 = new Name("Nick","Vuckovic");
    String stuId1 = "12334";
    cs1.setStudent( n1, stuId1 );       // ***** #11. add this method to CollegeStudent.java
                                        // ***** Then answer question.
    System.out.println( "setStudent( n1, stuId1 ) = " + cs1 );
    System.out.println( "#11.  Overloading?  Overriding?" );
    System.out.println("This is also overloading because they have the same names but with different parameters.");
  }                                                                                
}
                      