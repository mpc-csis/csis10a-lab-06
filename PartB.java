
/**
 * Write a description of class PartA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartB
{
    public static void main(String [] args)
    {
        /************* Prob 7 ***********************
        //  Write the method ack that defines the Ackerman function below main
        //   then test it with these statements
        
        System.out.println("ack(2,0) = " + ack(2,0));
        System.out.println("ack(2,2) = " + ack(2,2));
        
        // add a couple more test cases here

        //************** End Prob 7 ******************/      
        //************* Prob 8 ***********************
        // Run this segment and observe how the methods
        //   first, rest and length work
        
        System.out.println("first(\"Hello\") = " + first("Hello"));
        System.out.println("rest(\"Hello\") = " + rest("Hello"));
        System.out.println("length(\"Hello\") = " + length("Hello"));
        
        // now write the method printString below main
        //  test your method here:
        
        
        // now write the method printBackward below main
        //   test your method here
        
        
        // now write the method reverseString below main
        //   test your method here
        
        
        //************** End Prob 8 ******************/
    }
    
    
    // first: returns the first character of the given String
    public static char first(String s) {
        return s.charAt(0);
    }

    // last: returns a new String that contains all but the
    // first letter of the given String
    public static String rest(String s) {
        return s.substring(1, s.length());
    }

    // length: returns the length of the given String
    public static int length(String s) {
        return s.length();
    }    
}