//User function Template for Java

class Solution {
            ArrayList<String> ans = new ArrayList<String>();
    ArrayList<String> NBitBinary(int N) {
        // code here

        int count_0 = 0;
        int count_1 = 0;
        solve(count_0,count_1,N,"");
    return ans;
    }
    void solve(int count_0,int count_1,int N,String output)
    {
        if(N==0)
        {
            ans.add(output);
            return ;
        }
        if(N>0)
        {
            String output1 = new String(output);
            output1 += "1";
            solve(count_0,count_1+1,N-1,output1);
        }
        if(count_1>count_0)
        {
            String output2 = new String(output);
            output2 += "0";
            solve(count_0+1,count_1,N-1,output2);
        }
        
    }
}
