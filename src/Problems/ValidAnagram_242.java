package Problems;

/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.
 */

public class ValidAnagram_242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int counter[] = new int[26];
        for(int i=0; i<s.length();i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int count : counter) {
            if(count!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaran";
        if(isAnagram(s, t)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
