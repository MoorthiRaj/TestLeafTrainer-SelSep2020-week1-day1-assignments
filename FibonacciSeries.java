package week1.day1.assignments;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)I followed the instruction but output is printed as 0 0 0 0 0 0 0 0
	 * 2)Moved the code from the for loop and firstNum value 0 is printed. 
	 * 3)Found I have assigned the values reversely and reassigned correctly
	 * 4)Loop not working as the code is outside the for loop so again moved into it
	 * 5)Referred sample program to print with space --> System.out.print(firstNum + " ");. Also series of variables.
	 * 
	 */
	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range = 8 & firstNum = 0, secNum = 1 in the series)
		int range = 8, firstNum = 0, secNum = 1;
		
		// Iterate from 1 to the range
		for(int i=1; i<=range; i++) {
			
			// Print first number
			System.out.print(firstNum + " ");
						
			// add first and second number
			int sum = firstNum + secNum;
								
			// Assign second number to the first number
			firstNum = secNum;
						
			// Assign sum to the second number
			secNum = sum;

		}

	}

}
