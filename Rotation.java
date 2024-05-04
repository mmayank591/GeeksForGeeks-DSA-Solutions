class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int count=0;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=min)
            {
                count++;
            }
            else
            {
                return count;
            }
        }
        return count;
    }
}
