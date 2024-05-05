class Sol
{
    int countCamelCase (String s)
    {
        // your code here 
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            boolean check=Character.isUpperCase(s.charAt(i));
            if(check)
            {
                ans++;
            }
        }
        return ans;
    }
}
