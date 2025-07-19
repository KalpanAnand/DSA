/*Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

Note: If multiple occurrences are there, please return the smallest index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.
Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.
Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0. */

class Solution {
    public int binarysearch(int[] arr, int k) {
        int first=0;
        int last=arr.length-1;
        int result=-1;
        while(first<=last)
        {
                int mid=(first+last)/2;
                if(arr[mid]==k)
                {
                    result=mid;
                    last=mid-1;
                }
                else if(k<arr[mid])
                {
                    last=mid-1;
                }
                else
                {
                    first=mid+1;
                }
                
        }
        
        return result;
    }
}