class Solution {
    static int nthFibonacci(int n){
        // code here
        int mod=1000000007;
        int a=1;
        int b=1;
        for(int i=3;i<=n;i++)
        {
            a = (a+b)%mod;       //a  b  c     a=c=a+b;    swapping a=b b=a  so we return b;
            int temp=0;
            temp=a;
            a=b;
            b=temp;
        }
    return b;
    }
}
