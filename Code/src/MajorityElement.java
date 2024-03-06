/*Based on Moore's Voting algorithm

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?*/


package Code.src;

public class MajorityElement {
	    public static int majorityElement(int[] nums) {
	        int ansIndex = 0;
	        int count = 0;
	        
	        for(int i = 0;i<nums.length;i++)
	        {
	            if(nums[i]==nums[ansIndex])
	            {
	                count++;
	            }
	            else{
	                count--;
	            }
	            
	            if(count==0)
	            {
	                ansIndex = i;
	                count = 1;
	            }
	            
	        }
	        int c = 0;
	        for(int i = 0;i<nums.length;i++)
	        {
	            if(nums[ansIndex]==nums[i])
	            {
	                c++;
	            }
	        }
	        
	        
	        	return nums[ansIndex];
	        //return (c>(nums.length/2))?nums[ansIndex]:-1;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}

}
