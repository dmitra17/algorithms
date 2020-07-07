package Problems;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger_007 {
    public static int reverse(int x) {
        long reverse = 0;
        while(x!=0) {
            int a = x%10;
            reverse = reverse*10 + a;
            if( reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
            x/=10;
        }
        return (int)reverse;
    }

    public static void main(String args[]) {
        int numberToReverse = 10939;
        int reverseNumber = reverse(numberToReverse);
        System.out.println("The reverse of the number is: "+reverseNumber);
    }
}
