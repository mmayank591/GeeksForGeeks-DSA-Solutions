
class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        int r=0;
        int g=0;
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='G')
            {
                g++;
            }
            else
            {
                r++;
            }
        }
        int ans=0;
        ans=Math.min(r,g);
        return ans;
    }
}
