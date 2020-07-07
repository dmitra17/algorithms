package Problems;

/*
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.


Note: You may assume the string contains only lowercase English letters.
 */

import java.util.HashMap;

public class FirstUniqueCharacterInString_387 {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<n; i++) {
            if(count.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String s = "india";
        int index = firstUniqChar(s);
        System.out.println("The index is: " + index);
    }

}
