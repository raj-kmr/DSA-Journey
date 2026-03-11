// # Problem : https://leetcode.com/problems/second-largest-digit-in-a-string/

/* 
Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

 

Example 1:

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2:

Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
*/

package String;

public class SecondLargestDigit {
    public static void main(String[] args) {

        String s = "drta12321fn";

        int max = -1;
        int secondMax = -1;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                int digit = s.charAt(i) - '0';

                if (digit > max) {
                    secondMax = max;
                    max = digit;
                }
                else if (digit > secondMax && digit < max) {
                    secondMax = digit;
                }

            }
        }
        System.out.println(secondMax);

    }
}

// Time complexity: O(n)
// Space complexity: O(1)