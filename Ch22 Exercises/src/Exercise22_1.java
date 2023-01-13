/*
 * Eloi Nshuti
 * Exercise 22-1
 * 01/13/2023
 */

import java.util.*;
public class Exercise22_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String subject = input.nextLine();
		
		LinkedList<Character> list = new LinkedList<>();
		LinkedList<Character> store = new LinkedList<>();	
		
		for (int i = 0; i < subject.length(); i++) {

			if (!list.isEmpty() && subject.charAt(i) <= list.getLast() && list.contains(subject.charAt(i))) {
				list.clear();
			}
			
			list.add(subject.charAt(i));
			
			if (list.size()>store.size()) {
				store.clear();
				store.addAll(list);
			}
		}
		
		ListIterator<Character> listIterator = store.listIterator();
		System.out.print("Maximum consecutive substring is: ");	
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next());	
			}
		
	}
}

/*
 * T(n) = (a constant c)*n = O(n)
 * 
 * 1st loop 
 * (if-statement + list.add(....)-statement + if-statement)
 * O(n) + O(n) + O(n) = O(n)
 * 
 * 2nd loop
 * (while loop [System.out.print(listIterator.next())])
 * O(n)
 * 
 * 
 * T(n) = O(n)----- Linear time
 */