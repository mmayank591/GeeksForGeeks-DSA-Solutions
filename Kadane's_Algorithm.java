
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maxEnd=arr[0];
        long res=arr[0];
        for(int i=1;i<n;i++)
        {
            maxEnd=Math.max(maxEnd+arr[i],arr[i]);
            res=Math.max(maxEnd,res);
        }
    return res;
    }
    
}
