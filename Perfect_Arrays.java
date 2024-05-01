

class Solution {
    public static boolean isPerfect(int n, int[] arr) {
        // code here
        int flag=0;
        int mid=n/2;
        if(mid%2!=0)
        {
        for(int i=0;i<mid;i++)
        {
            if(arr[i]!=arr[n-1-i])
            {
                flag=1;
            }
        }
        }
        else
        {
            for(int i=0;i<mid;i++)
        {
            if(arr[i]!=arr[n-1-i])
            {
                flag=1;
            }
        }
        }
        return flag==0 ? true : false;
    }
}
