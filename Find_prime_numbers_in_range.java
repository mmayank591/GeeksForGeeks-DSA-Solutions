class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=M;i<=N;i++)
        {
            if(isPrime(i)==true)
            {
                ans.add(i);
            }
        }
    return ans;
    }
    boolean isPrime(int a)
    {
        if(a==1)
        {
            return false;
        }
        for(int j=2;j*j<=a;j++)
        {
            if(a%j==0)
            {
                return false;
            }
        }
    return true;
    }
}
