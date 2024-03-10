package Code.src;
/*For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.*/
class GCDStrings{

    public static String gcdOfStrings( String a, String b){

        if(!(a+b).equals(b+a))
            {
                return "";
            }
            int len = gcd(a.length(),b.length());
            return a.substring(0,len);
    }
    private static int gcd(int a, int b) {
        
        return b==0?a:gcd(b,a%b);
    
    } 
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABCABC", "ABC"));
    }

}