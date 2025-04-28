// Problem: https://leetcode.com/problems/maximum-subarray

/*
 Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
*/

public class MaximumSubarray {
    public static void main(String[] args) {

    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Output: 6

     // Initialize maxSum and currSum as start digit of nums
     int maxSum = nums[0];
     int currSum = nums[0];

     // Traversing the array from 1 to n-1
     for (int i = 1; i < nums.length; i++){
         // Checking if our current element in nums is > currSum 
         if(nums[i] > (currSum + nums[i])){
             // update the currSum as current element
             currSum = nums[i];
         } else {
             // or just add the current element in our currSum
             currSum += nums[i];
         }

         // Check if maxSum is less than our currSum
         if(maxSum < currSum){
             // if it is than we update the maxSum as currSum
             maxSum = currSum;
         }
     }   

     System.out.println(maxSum);

    }
}

/*
 * Time Complexity: We have been running a loop from 1 to n-1, so time complexity will be O(n)
 * 
 * Space complexity: We have intialize two integers to store our maximum sum and current Sum, Since both of these are storing integer values, So space complexity will be O(1). 
*/