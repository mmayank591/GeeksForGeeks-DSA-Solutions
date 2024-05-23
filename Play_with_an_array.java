
class GfG
{
	public int[] formatArray(int[] a,int n)
        {
        // add code here.
        Arrays.sort(a);
        int h=n-1;
        int l=0;
        while(l<=h)
        {
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
        for(int i=1;i<n;i=i+2)
        {
            int t=a[i];
            a[i]=a[i-1];
            a[i-1]=t;
        }
        return a;
	}
}
