class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int count=1;
        String rep = A;
        while(rep.length()<B.length())
        {
            rep=rep+A;
            count++;
        }
        if(rep.contains(B))
        {
            return count;
        }
        rep=rep+A;
        if(rep.contains(B))
        {
            return count+1;
        }
        return -1;
    }
};
