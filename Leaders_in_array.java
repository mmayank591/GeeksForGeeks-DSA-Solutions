class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int maxi=arr[n-1];
        ans.add(maxi);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=maxi)
            {
                ans.add(arr[i]);
            }
                    maxi=Math.max(maxi,arr[i]);
        }
        Collections.sort(ans,Collections.reverseOrder());
    return ans;
    }
}
