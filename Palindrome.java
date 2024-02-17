class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int temp = 0;
        int y = x;

        while(y>0)
        {
            temp = temp*10 + y%10;
            y=y/10;

        }

        if(temp==x) return true;

        return false;
    }
}