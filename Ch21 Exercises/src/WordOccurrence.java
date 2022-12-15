/* Eloi Nshuti
 * 12/15/2022
 * Programming Exercise 21-7
 */

public class WordOccurrence implements Comparable<WordOccurrence> {
	Integer count;
	String word;
	
	public WordOccurrence(String word, Integer count) {
		this.word = word;
		this.count = count;
	}

	@Override
	public int compareTo(WordOccurrence o) {
		return o.count.compareTo(count);
	}
	
	 public String toString() {
		return word + "    " + count;
		 
	 }
  }
