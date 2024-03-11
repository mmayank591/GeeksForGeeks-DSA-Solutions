
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        while(true)
        {
        
        int ol=x.length();
        x=x.replace("[]","");
        x=x.replace("{}","");
        x=x.replace("()","");
        
        int ml=x.length();
        
        if(ml==ol)
        {
            break;
        }
        }
    return x.length()==0 ? true : false;
    }
}
