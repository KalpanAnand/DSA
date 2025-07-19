/*Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist. */


class Solution {
    public int getSecondLargest(int[] arr) {
       int lar=Integer.MIN_VALUE;
       int second=-1;
       for(int i=0;i<arr.length;i++)
       {
           if(lar<arr[i])
           {
               second=lar;
               lar=arr[i];
           }
           else if(second<arr[i] && second != lar && lar>arr[i])
           {
               second=arr[i];
           }
       }
        return second==(Integer.MIN_VALUE)? -1:second;
    }
}
