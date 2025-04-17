// # Problem: https://leetcode.com/problems/two-sum/

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 
// # Solution

// Overview: This is the brute force method that i used to solve this problem, it's not optimised and also using O(n2). 

public class TwoSum {
    public static int[]  main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;

        // iterating through each element in the array
        for(int i = 0; i < nums.length; i++){
            //Start j from i+1 to avoid using the same element twice
            for(int j = i+1; j < nums.length; j++){
                // Adding the element of first loop from each element of second loop until we found the sum to same as target
                if(nums[i] + nums[j] == target){
                    // return the indices if pair is found
                    return new int[]{i, j};
                }
            }
        }
        // return null if no pair founded
        return null;
    }
}

// # Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.
 

// Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?