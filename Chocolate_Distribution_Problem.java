
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long md=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++)
        {
            md=Math.min(md,a.get(i+(int)m-1)-a.get(i));
        }
    return md;
    }
}
