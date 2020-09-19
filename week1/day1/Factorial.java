package week1.day1.classroom;

public class Factorial {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)Got confused as where to declare fact as I have not read the instructions properly
	 * 2)Then declared the variables properly
	 * 3)Inside the for loop, first I have not mentioned the fact variable multiplication
	 * 4)Got confused what to place and where to place
	 * 5)I got "Unresolved compilation problem:" error because of extra { bracket
	 * 6)After removing the extra bracket the code worked. Refered a youtube video to cross verify my code.
	 */	
	public static void main(String[] args) {

			// Declare your input as 5
			int input = 5;
			
			// Declare an integer variable fact as 1
			int fact = 1;

			// Iterate from 1 to your input (tip: using loop concept)
			for(int i=1; i <= input; i++) {
			
				// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
					fact = fact*i;
			}   //End of loop

				// Print factorial (fact)
				System.out.println(fact);

			}

}
