/*
 * Eloi Nshuti
 * Exercise 22-3
 * 01/13/2023
 */

import java.util.Scanner;

public class Exercise22_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string s1: ");
		String subject1 = input.nextLine();
		
		System.out.print("Enter a string s2: ");
		String subject2 = input.nextLine();
		
		int count = 0;
		for(int i = 0; i < subject1.length(); i++) {
				
			if (subject1.charAt(i) == subject2.charAt(count)) {
				count++;
			}
			else {
				count = 0;
			}
			
			if(count == subject2.length()) {
				System.out.print("Matched at index: " + (i-3));
				System.exit(0);
			}
		}
		System.out.print("Not a substring.");
	}
}

/*
 * T(n) = (a constant c)*n = O(n)
 * 
 * 1st loop
 * (if-statement + else-statement + if-statement)
 * O(n) + O(n) + O(n) = O(n)
 * 
 * T(n) = O(n)----- Linear time
 */