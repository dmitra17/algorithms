package Problems;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */

public class MajorityElements_169 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for(int num : nums) {
            if(count==0) {
                candidate = num;
            }
            count += (num==candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, 4, 4, 5, 4, 5};
        int majorityElement = majorityElement(arr);
        System.out.println("The majority element is: " + majorityElement);
    }
}
