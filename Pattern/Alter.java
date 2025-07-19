package Pattern;

/*Input: 5

Output:
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1 */


class Solution {

    void printTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            int start=(i%2==0) ? 0:1;
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
        
    }
}
