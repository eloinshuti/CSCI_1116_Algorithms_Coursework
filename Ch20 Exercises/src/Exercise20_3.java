/* Eloi Nshuti
 * Programming Exercise 20-3
 * 12/06/2022
 */
import java.util.*;

public class Exercise20_3 {
	public static void main(String[] args) {
		String[][] stateCapital = {
				{"Alabama", "Montgomery"},
	    	    {"Alaska", "Juneau"},
	    	    {"Arizona", "Phoenix"},
	    	    {"Arkansas", "Little Rock"},
	    	    {"California", "Sacramento"},
	    	    {"Colorado", "Denver"},
	            {"Connecticut", "Hartford"},
	            {"Delaware", "Dover"},
	            {"Florida", "Tallahassee"},
	            {"Georgia", "Atlanta"},
	            {"Hawaii", "Honolulu"},
	            {"Idaho", "Boise"},
	            {"Illinois", "Springfield"},
	    	    {"Indiana", "Indianapolis"},
	    	    {"Iowa", "Des Moines"},
	            {"Kansas", "Topeka"},
	    	    {"Kentucky", "Frankfort"},
	    	    {"Louisiana", "Baton Rouge"},
	    	    {"Maine", "Augusta"},
	    	    {"Maryland", "Annapolis"},
	    	    {"Massachusettes", "Boston"},
	    	    {"Michigan", "Lansing"},
	    	    {"Minnesota", "Saint Paul"},
	    	    {"Mississippi", "Jackson"},
	    	    {"Missouri", "Jefferson City"},
	    	    {"Montana", "Helena"},
	    	    {"Nebraska", "Lincoln"},
	    	    {"Nevada", "Carson City"},
	    	    {"New Hampshire", "Concord"},
	    	    {"New Jersey", "Trenton"},
	    	    {"New York", "Albany"},
	    	    {"New Mexico", "Santa Fe"},
	    	    {"North Carolina", "Raleigh"},
	    	    {"North Dakota", "Bismarck"},
	    	    {"Ohio", "Columbus"},
	    	    {"Oklahoma", "Oklahoma City"},
	    	    {"Oregon", "Salem"},
	    	    {"Pennsylvania", "Harrisburg"},
	    	    {"Rhode Island", "Providence"},
	    	    {"South Carolina", "Columbia"},
	    	    {"South Dakota", "Pierre"},
	    	    {"Tennessee", "Nashville"},
	    	    {"Texas", "Austin"},
	    	    {"Utah", "Salt Lake City"},
	    	    {"Vermont", "Montpelier"},
	    	    {"Virginia", "Richmond"},
	    	    {"Washington", "Olympia"},
	    	    {"West Virginia", "Charleston"},
	    	    {"Wisconsin", "Madison"},
	    	    {"Wyoming", "Cheyenne"}
	    	    };
		
		List<String> state =  new ArrayList<>();
		List<String> capital =  new ArrayList<>();
		
		for (int j = 0; j < stateCapital.length; j++) {
			state.add(stateCapital[j][0]);
			capital.add(stateCapital[j][1]);
			}
		
		Scanner input = new Scanner(System.in);
		
	    int correctCount = 0;
	    for (int i = 0; i < stateCapital.length; i++) {
	    	// Prompt the user with a question
	    	System.out.print("What is the capital of " + state.get(i) + "? ");
	    	String capital1 = input.nextLine().trim().toLowerCase();
	    	
	    	if (capital1.toLowerCase().equals(capital.get(i).toLowerCase())) {
	    		System.out.println("Your answer is correct");
	    		correctCount++;
	    		}
	    	else
	    		System.out.println("The correct answer should be " + capital.get(i));
	    	
			Collections.shuffle(state, new Random(i));
			Collections.shuffle(capital, new Random(i));
	    	}
	    
	    System.out.println("The correct count is " + correctCount);
	}
}
