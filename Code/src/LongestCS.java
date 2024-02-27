package Code.src;
class LongestCS{


public static int lcsUtils( int m, int n, String a, String b, int dp[][] )
{
    if(m==0||n==0)
    {
        return 0;
    }
    if(dp[m][n]!=-1)
    {
        return dp[m][n];
    }
    if(a.charAt(m-1)==b.charAt(n-1))
    {
        return dp[m][n]=1+lcsUtils(m-1,n-1,a,b,dp);
    }
    else
        return dp[m][n]=Math.max(lcsUtils(m,n-1,a,b,dp),lcsUtils(m-1,n,a,b,dp));
}
public static int longestCS(int m, int n, String a, String b)
{
    int dp[][]=new int[m+1][n+1];
    for(int i = 1;i<=m;i++)
    {
        for(int j = 1;j<=n;j++)
        {
            dp[i][j]=-1;
        }
    }
    return lcsUtils(m,n,a,b,dp);
}
public static void main(String[] args)
{
    String a = "abcdfghi";
    String b = "cdfg";
    System.out.println(longestCS(a.length(),b.length(),a,b));
    System.out.println("-- Program was executed using recursion and dynamic programming array");
}

}
