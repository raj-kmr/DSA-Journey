// #Problem: https://leetcode.com/problems/palindrome-number/description/


package Foundations;

public class PalindromNumber {
    public static void main(String[] args) {
        int x = 10;

        if(x < 0){
            System.out.println(false);
        }

        int given = x;
        int ans = 0;
        while(x > 0){
            int rem = x % 10;
            ans = ans * 10 + rem;
            x  = x / 10;
        }

        if(given == ans){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

// Time complexity = O(d) where d is the number of digits
// Space complexity = O(1)