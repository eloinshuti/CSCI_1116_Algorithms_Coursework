/* Eloi Nshuti
 * 12/15/2022
 * Programming Exercise 21-9
 */
import java.util.*;

public class Exercise08_37 {
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
    
    Map<String, String> map = new LinkedHashMap<>();
    
    for (int i = 0; i < stateCapital.length; i++) {
        String key = stateCapital[i][0];
        String value = stateCapital[i][1];
        map.put(key, value);
      }
    
	Scanner input = new Scanner(System.in);
	
	Set<Map.Entry<String, String>> entrySet = map.entrySet();
	
	int correctCount = 0;
	
	for (Map.Entry<String, String> entry: entrySet) {
	      // Prompt the user with a question
	      System.out.print("What is the capital of " + entry.getKey() + "? ");
	      String capital = input.nextLine().trim().toLowerCase();
	      
	      if (capital.toLowerCase().equals(entry.getValue().toLowerCase())) {
	        System.out.println("Your answer is correct");
	        correctCount++;
	      }
	      else
	        System.out.println("The correct answer should be " + entry.getValue());
	}
    System.out.println("The correct count is " + correctCount);
  }
}
