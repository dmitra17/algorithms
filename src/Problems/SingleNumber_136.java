package Problems;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1

Example 2:

Input: [4,1,2,1,2]
Output: 4
 */

public class SingleNumber_136 {
    public static int singleNumber(int[] nums) {
        int a = 0;
        for(int i : nums) {
            a = a ^ i;
        }
        return a;
    }
    public static void main(String args[]) {
        int arr[] = {3, 5, 5, 3, 4, 6, 6};
        int singleNumber = singleNumber(arr);
        System.out.println("The singleNumber is: " + singleNumber);
    }
}
