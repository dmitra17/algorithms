package Problems;

/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class PalindromeNumber_009 {
    public static boolean isPalindrome(int x) {
        int sum = 0, num = x;

        if(x<0 || x%10 ==0 && x!=0) {
            return false;
        }

        while(x!=0) {
            sum = 10*sum + x%10;
            x/=10;
        }
        return (num==sum) ? true : false;
    }

    public static void main(String args[]) {
        int number1 = 10010;
        int number2 = 10001;

        boolean isPalindrome1 = isPalindrome(number1);
        System.out.println(isPalindrome1);
        boolean isPalindrome2 = isPalindrome(number2);
        System.out.println(isPalindrome2);
    }
}
