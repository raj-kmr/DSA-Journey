// Problem: https://leetcode.com/problems/power-of-two/


public class PowerOfTwo {
    public static void main(String[] args){
        int n = 6;

        if(n <= Integer.MIN_VALUE){
            System.out.println(false);
        }

        if((n != 0) && ((n & (n - 1)) == 0)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

// Time complexity = O(1)
// Space complexity = O(1)