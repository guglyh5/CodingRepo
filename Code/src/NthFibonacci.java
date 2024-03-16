package Code.src;
/*Problem Statement
Write a program to find Nth Fibonacci number. 

The integers in the following order are the Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.

Example 1:
Input: 
n = 1
Output: 
1 
Explanation: 
1 is the 1st number of fibonacci series.
Example 2:
Input: 
n = 2
Output: 
1
Explanation: 
1 is the 2nd number of fibonacci series.
Constraints:
1 <= n <= 30 */
class NthFibonacci 
{
    public int nthFibonacci (int input)
    {
        if(input==0)return 0;
        if(input==1)return 1;

        return nthFibonacci(input-1)+nthFibonacci(input-2);
    }
}