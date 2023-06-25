public class FirstNonRepeatingCharacter {
    public static int firstUniqChar(String s) {
        int[] charFreq = new int[26];
        for (char c : s.toCharArray()) {
            charFreq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charFreq[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetlcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}


// given question
// First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:
// Input: s = "leetcode"
// Output: 0

// Example 2:
// Input: s = "loveleetcode"
// Output: 2

// Example 3:
// Input: s = "aabb"
// Output: -1

// Constraints:
// a. 1 <= s.length <= 10^5
// b. s consists of only lowercase English letters.
