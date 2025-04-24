// Problem: https://leetcode.com/problems/running-sum-of-1d-array/description/


// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
// Example 3:

// Input: nums = [3,1,2,10,1]
// Output: [3,4,6,16,17]


public class RunningSumOfArray {
    public static void main (String[] args){
        int[] nums = {1, 2, 3, 4};

        // Initializing an array of same size as given array
        int[] ans = new int[nums.length];

        // Storing the first value of given array in our answer array
        ans[0] = nums[0];

        // Traversing the array from second index
        for(int i = 1; i < nums.length; i++){

            // Adding previous element of our ans array and current element in nums
            ans[i] = ans[i-1] + nums[i];
        }

        // Printing the answer
        for(int i=0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}


/* Time Complexity: We are not using any nested for loops so the time complexity will going to be O(n);
 * 
 * Space Complexity: For space, we had used an array of n size to store out answer because n could be anything therefore it will also be O(n);
*/