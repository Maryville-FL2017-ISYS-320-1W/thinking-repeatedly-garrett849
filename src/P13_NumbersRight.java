/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P13_NumbersRight {

	public static void main(String[] args) {

		int rows = 5;
		for (int line = 1; line <= rows; line++) {
			for (int spacesIndex = 1; spacesIndex <= rows - line; spacesIndex++) {
				System.out.print(" ");
			}
			for (int numbersIndex = 1; numbersIndex <= line; numbersIndex++) {
				System.out.print(line);
			}
			System.out.println();
		}
	}

}
