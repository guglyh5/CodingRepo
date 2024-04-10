/*Used in 1207. Unique Number of Occurrences */
//Find all the occurences of each character in a String
package Code.src;

import java.util.HashMap;
import java.util.Map;

public class FindOccur {
	
	public static Map<Character, Integer> findOccur( String s)
	{
		Map<Character, Integer> counter = new HashMap<Character, Integer>();
		
		for(char c: s.toCharArray())
		{
			if(counter.containsKey(c))
			{
				counter.put(c, counter.getOrDefault(c, 0)+1);
			}
			else {
				counter.put(c, 1);
			}
				
		}
		
		return counter;
	}

	public static void main(String[] args) {
		
		System.out.println(findOccur("aabbccddd").toString());
	}

}
