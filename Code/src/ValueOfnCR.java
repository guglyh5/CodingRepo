package Code.src;
/*Problem Statement
Given two integers n and r, find nCr (Combination)

Example 1:
Input: n = 3, r = 2
Output: 3
Explaination: 3C2 = 3. 
Example 2:
Input: n = 4, r = 4
Output: 1
Constraints:
1 ≤ n, r ≤ 20 */
public class ValueOfnCR {
    public static long fact( int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }

    public static int nCr(int n, int r)
    {

        long result = fact(n)/(fact(r)*fact(n-r));

        return (int) result;
    }


}
