// #Problem: https://leetcode.com/problems/contains-duplicate/

/*
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
*/


import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(String[] args) {
        int [] nums = {1, 2, 3, 1};

        // Sorting the array to check for duplicates
        Arrays.sort(nums);
        // Iterating through the array to check for duplicates
        for(int i=1; i < nums.length; i++){
            // Checking if the curr element is == to prev element
            if(nums[i] == nums[i-1]){
                // Returning true if we find a duplicate
                return true;
            }
        }
        // Returning false if no duplicates found
        return false;
    }
}

/* Time Complexity: O(nLog n) 
   We sort the array first, which takes O(nLog n) time, and then we iterate through the array once to check for duplicates, which takes O(n) time.

   Space Complexity: O(1)
   Not using any extra space so this is O(1) space
   complexity.
*/


// Constraints:

// 1 <= nums.length <= 10 to power 5
// -109 <= nums[i] <= 10 to power 9