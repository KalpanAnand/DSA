/*Given an array nums of positive integers of size N. Find all distinct digits present in nums.
 

Example 1:

Input: nums = [131, 11, 48]
Output: 1 3 4 8
Explanation: 1, 3, 4, and 8 are only distinct
digits that can be extracted from the numbers
of the array.
Example 2:

Input: nums = [111, 222, 333, 4444, 666]
Output: 1 2 3 4 6
Explanation: 1, 2, 3, 4, and 6 are only distinct
digits that can be extracted from the numbers
of the array.
 

Your Task: 
You don't need to read or print anything. Your task is to complete the function common_digits() which takes nums as input parameter and returns a list of digits which can be extracted from the given array in ascending order.
 

Expected Time Complexity: O(N)
Expected Space Complexity: O(N) */


// User function Template for Java

import java.util.*;

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        Set<Integer>set=new TreeSet<>();
        int rem;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            while(n>0)
            {
                rem=n%10;
                set.add(rem);
                n=n/10;
            }
        }
       int arr[]=new int[set.size()];
       int i=0;
       for(int digit:set)
       {
           arr[i++]=digit;
       }
       return arr;
    }
}