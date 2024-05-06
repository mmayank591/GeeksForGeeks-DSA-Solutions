
class Solution
{
    ArrayList<Long> arranged(long a[], int n)
    {
        ArrayList<Long> ans = new ArrayList<Long>();
        ArrayList<Long> pos = new ArrayList<Long>();
        ArrayList<Long> neg = new ArrayList<Long>();
        int posIndex = 0;
        int negIndex =0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                pos.add(a[i]);
            }
            else
            {
                neg.add(a[i]);
            }
        }
        while(posIndex < pos.size() || negIndex < neg.size())
        {
            if(posIndex<pos.size())
            {
                ans.add(pos.get(posIndex++));
            }
            
            if(negIndex<neg.size())
            {
                ans.add(neg.get(negIndex++));
            }
        }
        return ans;
    }
}
