/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] arr)
	{
		Arrays.sort(arr);
		String str1 = arr[0];
		String str2 = arr[arr.length-1];
		int index = 0;
		
		while(index<str1.length())
		{
			if(str1.charAt(index)==str2.charAt(index))
			{
				index++;
			}
			else
			{
				break;
			}
		}
		return index==0?"":str1.substring(0, index);
	}

	public static void main(String[] args) {
		String[] arr = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(arr));

	}

}
