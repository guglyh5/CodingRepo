package Code.src;
/*Problem Statement
Create a function that counts the number of times a string (str2) appears in another string (str1).

Example 1:
Input : 
str1 = "hello world, hello universe"
str2 = 'hello'

Output :
2

Explanation:
'hello' appears two times in str1.
Example 2:
Input : 
str1 = "hello"
str2 = 'hi'

Output : 
0

Explanation: 
'hi' didn't appears in str1.
Constraints:
1 <= str1.length(), str2.length() <= 10^6.

str1 and str2 can contain lowercase, uppercase alphabet, numbers, and special characters. */


public class CountOccurrencesString {
    public static int count(String text, String word) {

        if(text.length()<word.length()||text==null||word==null)
        return 0;
  
        int count = 0;
        int index=0;
  
  
        while(index!=-1)
        {
          index = text.indexOf(word,index);
          if(index!=-1)
          {
            count++;
            index++;
          }
        }
  
        return count;
}

}
