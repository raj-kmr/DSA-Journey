// #Problem: https://leetcode.com/problems/rotate-array/description/


/* 
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/


public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = nums.length;
        // Taking an array to store the answer
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            // Finding the position of each element after rotating
            int idx = (i + k) % nums.length;
            // Placing the element in the rotated position in new array
            ans[idx] = nums[i];
        }

        // for each element modify the given array from the answer array
        for(int i = 0; i < nums.length; i++){
            nums[i] = ans[i];
        }
    }
}

// Time Complexity: We haven't use nested loop so time complexity will be O(n)
// Space complexity: We have took an array  of N size to store elements in their rotated position, so it will also be O(n)