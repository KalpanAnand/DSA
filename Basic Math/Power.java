/*Given a number n, find the value of n raised to the power of its own reverse.
Note: The result will always fit into a 32-bit signed integer.

Examples:

Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and 22 = 4.
Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 101 = 10.
Constraints:
1 ≤ n ≤ 10
*/

class Solution {
    public int reverseExponentiation(int n) {
        int N=n;
        int rev=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            if(rem!=0)
            {
                rev=(rev*10)+rem;
            }
            n=n/10;
        }
        double power=Math.pow(N,rev);
        if(power<=Integer.MAX_VALUE && power>=Integer.MIN_VALUE)
        {
            return (int)power;
        }
        else{
            return -1;
        }
    }
}

