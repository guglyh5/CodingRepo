package Code.src;
/*
 * Problem Statement
Given a string S, check if it is palindrome or not.

Example 1:
Input: S = "racecar"
Output: 1
Explanation: S is a palindrome
Example 2:
Input: S = "adr" 
Output: 0
Explanation: S is not a palindrome
Constraints:
0 <= Length of S <= 2*105
 */


public class PalindromeString {
    public static boolean isPalindrome(String str)
    {

      StringBuilder sb = new StringBuilder();

      for(int i = str.length()-1;i>=0;i--)
      {
        sb.append(str.charAt(i));
      }

      return (sb.toString().equals(str));
    }
}
