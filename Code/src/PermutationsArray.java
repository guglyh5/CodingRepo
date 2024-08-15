package Code.src;

import java.util.*;

/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.

Need to return the list of lists in a sorted way, element by element
 */
class PermutationsArray {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int l = 0;
        int r = nums.length-1;
        generatePermutations(nums,result,l,r);
        Collections.sort(result, new Comparator<List<Integer>>() { //Code for returned list sorting started
        public int compare(List<Integer> o1, List<Integer> o2) {
            int minSize = Math.min(o1.size(), o2.size());
            for (int i = 0; i < minSize; i++) {
                int cmp = Integer.compare(o1.get(i), o2.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(o1.size(), o2.size());
        }
    }); // Sorting code ended.

        return result;
        
    }

    private static void generatePermutations(int[] nums, List<List<Integer>> result, int l, int r)
    {
        if(l==r)
        {
            Integer[] b = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                b[i] = Integer.valueOf(nums[i]);
                }
            List<Integer> newList = new ArrayList<Integer>(Arrays.asList(b));
        result.add(newList);
        return;
        }

        for(int i = l ; i<=r; i++)
        {
            swap(nums,i,l);
            generatePermutations(nums,result,l+1,r);
            swap(nums,i,l);
        }
    }

    private static void swap(int[] nums, int i, int l)
    {
        int temp = nums[i];
        nums[i] = nums[l];
        nums[l]=temp;
    }
}