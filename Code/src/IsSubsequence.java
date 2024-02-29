/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without 
disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 

Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence.
 In this scenario, how would you change your code?*/

class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
        {
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int i =0,j=0;

        if(s.length()<1){return true;}
        while(i<t.length())
        {
            if(tt[i]==ss[j])
            {
                j++;
            }
            i++;
            if(j==s.length())
            {
                return true;
            }
        
        }

        return false;
        

    }
}

//Find all the matches of characters of s(smaller string) in t(larger string). If the count is same as the length of s, then return true, is subsequence.