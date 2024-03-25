package Code.src;

public class PalindromeRecursion {
	
	
	public static boolean isPalindrome(String s)
	{
		return isPalindromeHelper(s, 0, s.length()-1);
	}
	public static boolean isPalindromeHelper(String s,int l, int r)
	{
		if(l>=r)
		{
			return true;
		}
		if(s.charAt(l)==s.charAt(r)) {
			return isPalindromeHelper(s, l+1,r-1); //Recursive leap of faith
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Is it Palindrome? " + (isPalindrome("racecr")?"Yes":"No"));
	}

}
