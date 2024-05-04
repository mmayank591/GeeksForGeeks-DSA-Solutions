
class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int minIndex=Integer.MAX_VALUE;
        HashMap<Integer,Integer> ans = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(ans.containsKey(arr[i]) && ans.get(arr[i]) < minIndex)
            {
                minIndex=ans.get(arr[i])+1;
            }
            else
            {
                ans.put(arr[i],i);
            }
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
