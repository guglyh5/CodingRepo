package Code.src;
/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters. */

class ReverseVowels {
    public String reverseVowels(String s) {
        if(s.length()==1)
        return s;
        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start<end)
        {
            if(isVowel(arr[start])&&isVowel(arr[end]))
                {
                    swap(arr, start,end);
                    start++;
                    end--;
                }
            else if(isVowel(arr[start]))
                {
                    end--;
                }
            else
                {
                    start++;
                }
        }
        
        return new String(arr); // Return new String based on the character array.
        }

    public static boolean isVowel(char c){
    return "aeiouAEIOU".indexOf(c) != -1;}

    public static void swap(char[] s, int start, int end) {
    char temp = s[start];
    s[start] = s[end];
    s[end] = temp;
}

}