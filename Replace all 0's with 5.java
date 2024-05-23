
/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
    String ans = String.valueOf(n).replace('0','5');
    int f = Integer.parseInt(ans);
    return f;
    }
}
