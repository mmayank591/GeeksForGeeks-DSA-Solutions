class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int ans=0;
       for(int i=1;i<n;i++)
       {
           if(arr[i]>=arr[ans])
           {
               ans=i;
           }
       }
       return ans;
    }
}
