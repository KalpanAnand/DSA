package Pattern;

/*Input: 5

Output:

*********
 *******
  *****
   ***
    * 
*/


class Solution {

    void printTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}