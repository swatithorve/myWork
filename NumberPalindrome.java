public class NumberPalindrome {
    public static void main(String[] args)
    {
        Solution3 s3 = new Solution3();
        System.out.println(s3.isPalindrome(121));
        System.out.println(s3.isPalindrome(-121));
        System.out.println(s3.isPalindrome(121454542));
    }
}

class Solution3 {

    public boolean isPalindrome(int n)
    {
        if ( n < 0 )
            return false;
        long newNum = 0;
        int x = n, mod = 0;
        while (x != 0)
        {
            mod = x % 10;
            newNum = newNum * 10 + mod;
            x = x / 10;
        }

        return n == newNum ;
    }

}