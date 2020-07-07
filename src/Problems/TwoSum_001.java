package Problems;

/*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given numbers = [2, 7, 11, 15], target = 9,

Because numbers[0] + numbers[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum_001 {

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++) {
            int complement = target - numbers[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(numbers[i],i);
        }
        throw new IllegalArgumentException("No Solution exists");
    }

    public static void main(String[] args) {

        int arr[] = {2,5,7,9, 13, 90};
        int target = 22;

        int arr_result[] = twoSum(arr, target);

        for(int i = 0; i <arr_result.length; i++) {
            System.out.println(arr_result[i]);
        }

    }
}
