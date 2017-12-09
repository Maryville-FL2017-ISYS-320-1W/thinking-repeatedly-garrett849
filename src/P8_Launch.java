/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 1. Your predicted output 
/*
 T-minus
 5,4,3,2,1
 Blastoff
 
*/


public class P8_Launch {
    public static void main( String[] args ) {
        System.out.println("T-minus ");
        for( int i = 5; i >= 1; i-- ) {
            System.out.print( i + ", " );
        }
        System.out.println("Blastoff!");
    }
}



// 3. Were you correct? Explain any differences and what you learned.
/*
 I was half right blastoff went on the same line as the count down because it was a print not println.
 */




