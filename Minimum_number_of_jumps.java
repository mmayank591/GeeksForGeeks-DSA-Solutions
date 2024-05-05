class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        int halt=0;
        int max=0;
        int jump=0;
        if(n<=1)
        {
            return 0;
        }
        if(arr[0]==0)
        {
            return -1;
        }
        for(int i=0;i<n-1;i++)
        {
            max=Math.max(max,i+arr[i]);
            if(max >= n-1)
            {
                jump++;
                return jump;
            }
            if(halt==i)
            {
                halt=max;
                jump++;
                if(i>=max)
                {
                    return -1;
                }
            }
        }
        if(halt >= n-1)
            {
                return jump;
            }
            return -1;
    }
}
