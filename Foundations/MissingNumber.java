// # Problem: https://leetcode.com/problems/missing-number/


public class MissingNumber{
    public static void main(String[] args){
        int[] arr = {3, 0, 1};
        int n = arr.length;
        int sum;
        int arrSum = 0;

        sum = (n * (n + 1)) / 2;

        for(int i = 0; i < n; i++){
            arrSum += arr[i];
        }

        int ans = sum - arrSum;

        System.out.println(ans);
    }
}


// Time complexity: O(n)
// Space complexity: O(1)