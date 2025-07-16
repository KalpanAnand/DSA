/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1*/


class Solution {
    public int reverse(int x) {
        boolean sign=true;
        if(x<0)
        {
            sign=false;
        }
        x=Math.abs(x);
        long rev=0;
        while(x>0)
        {
            rev=(rev*10)+(x%10);
            x=x/10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
            {
                return 0;
            }
        }
        if(!sign)
        {
            return (-1)*(int)rev;
        }
        return (int)rev;
        
    }
}

/* */
/*Input : n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2. */

class Solution {
    public int reverseDigits(int n) {
        int N=n;
        int rev=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            if(rem!=0)
            {
                rev=rev*10+rem;
            }
            n=n/10;
        }
        return rev;
    }
}