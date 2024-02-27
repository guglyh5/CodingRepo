package Code.src;
class LongestCS1{


    public static int lcsUtils( int m, int n, String a, String b, int dp[][] )
    {

        for ( int i = 1; i<=m ; i++)
        {
            for( int j = 1; j<=n; j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;

                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static int longestCS(int m, int n, String a, String b)
    {
        int dp[][]=new int[m+1][n+1];
        
        return lcsUtils(m,n,a,b,dp);
    }
    public static void main(String[] args)
    {
        String a = "abcdfghi";
        String b = "cdfg";
        System.out.println(longestCS(a.length(),b.length(),a,b));
        System.out.println("-- Program was executed using Bottom up technique and tabulation method");
    }
    
    }
    