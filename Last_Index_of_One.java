
class Solution {
    public int lastIndex( String s) {
        int ans=-1;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                ans=i;
            }
        }
        return ans;
    }
}
