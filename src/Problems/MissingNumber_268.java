package Problems;

/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */

public class MissingNumber_268 {

    public static int missingNumber(int[] nums) {
        int expectedSum = nums.length*(nums.length+1)/2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String args[]) {
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int missingNumber = missingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}
