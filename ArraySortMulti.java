import java.util.Random;
/*
 *	ARRAY SORTING
 *	
 *	Write code in the indicated area below to sort the elements of the "numbers"
 *  array in ascending order.  
 *  
 *	Example:
 *  The following is example output after a successful implementation:
 *	
 *		Before sorting:
 *      {{22, 26, 59, 52, 25}
 *       {76, 83, 77,  7, 70}
 *       {88, 53,  7, 55, 20}
 *       {71, 12, 67, 96, 13}
 *       {41, 17, 24, 78, 20}}
 *      After sorting:
 *      {{ 7,  7, 12, 13, 17}
 *       {20, 20, 22, 24, 25}
 *       {26, 41, 52, 53, 55}
 *       {59, 67, 70, 71, 76}
 *       {77, 78, 83, 88, 96}}	
*/
public class ArraySortMulti {
	public static void main(String[] args) {
		int[][] numbers = new int[5][5];  // This is the array to sort
		Random rand = new Random();
		System.out.println("Before sorting:");
		System.out.print("{");
		for(int i = 0; i < numbers.length; i++) {
			if(i > 0) System.out.print(" ");
			System.out.print("{");
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = rand.nextInt(100);
				System.out.printf("%2s", numbers[i][j]);
				if(j < numbers[i].length - 1) {
					System.out.print(", ");
				}	
			}
			System.out.print("}");
			if(i+1 < numbers.length) System.out.print("\n");
		}
		System.out.println("}");
		// ∧ ∧ ∧ ∧ ∧ ∧ ∧ LEAVE THE CODE ABOVE THIS LINE ALONE!!! ∧ ∧ ∧ ∧ ∧ ∧ ∧ 
		
		// YOUR CODE TO SORT THE numbers ARRAY GOES HERE
		
		// ∨ ∨ ∨ ∨ ∨ ∨ ∨ LEAVE THE CODE BELOW THIS LINE ALONE!!! ∨ ∨ ∨ ∨ ∨ ∨ ∨  
		boolean isWrong = false;
		System.out.println("After sorting:");
		System.out.print("{");
		for(int i = 0; i < numbers.length; i++) {
			if(i > 0) System.out.print(" ");
			System.out.print("{");
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%2s", numbers[i][j]);
				if(j < numbers[i].length - 1) {
					System.out.print(", ");
				}	
			}
			System.out.print("}");
			if(i+1 < numbers.length) System.out.print("\n");
		}
		System.out.println("}");
	}
}