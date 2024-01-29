class LongestCS{


public static int lcsUtils( int m, int n, String a, String b )
{
    if(m==0||n==0)
    {
        return 0;
    }
    if(a.charAt(m-1)==b.charAt(n-1))
    {
        return 1+lcsUtils(m-1,n-1,a,b);
    }
    else
        return Math.max(lcsUtils(m,n-1,a,b),lcsUtils(m-1,n,a,b));
}
public static int longestCS(int m, int n, String a, String b)
{
    return lcsUtils(m,n,a,b);
}
public static void main(String[] args)
{
    String a = "abcdfghi";
    String b = "cdfg";
    System.out.println(longestCS(a.length(),b.length(),a,b));
    System.out.println("-- Program was executed using recursion");
}

}
