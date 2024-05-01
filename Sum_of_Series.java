
class Solution {
    public static long seriesSum(int n) {
        // code here
        long ans=0;
        for(int i=1;i<=n;i++)
        {
            ans=ans+i;
        }
        return ans;
    }
}
