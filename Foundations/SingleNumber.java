// #Problem: https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static void main(String[] args){
        int[] arr = {3, 5, 6, 4, 3, 6, 5};

        int xorAns = 0;
        for(int num: arr){
            xorAns = xorAns ^ num;
        }

        System.out.println(xorAns);
    }
}

// Time complexity: O(n)
// Space complexity: O(1)