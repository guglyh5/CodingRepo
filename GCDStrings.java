class GCDStrings{

    public static String gcdOfStrings( String a, String b){

        if(!(a+b).equals(b+a))
            {
                return "";
            }
            int len = gcd(a.length(),b.length());
            return a.substring(0,len);
    }
    private static int gcd(int a, int b) {
        
        return b==0?a:gcd(b,a%b);
    
    } 
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABCABC", "ABC"));
    }

}