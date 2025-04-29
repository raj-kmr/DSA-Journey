// #Problem: https://leetcode.com/problems/sort-array-by-parity/

/*
Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
*/

public class SortArrayByParity {
    public static void main(String[] args){
        int[] nums = {3, 1, 2, 4};

        // start pointer
        int i = 0;

        // end pointer
        int j = nums.length-1;

        // Run until i < j
        while(i < j) {

            // Check if num at i is even
            if(nums[i] % 2 == 0){
                // if its even increment i by 1
                i++;
                // else check num at j is odd
            } else if(nums[j] % 2 != 0){
                //if its odd decrement j by 1
                j--;
            } else {
                // if none of the above swap num at i and j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Printing nums array
        for(int m = 0; m < nums.length; m++){
            System.out.print(nums[m] + ", ");
        }
    }
}

/* Time complexity: We are traversing the given array one time, So the time complexity is O(n);
 * 
 * Space Complexity: We have used two int to store start and end pointer, and both are constant so it will be O(1);
*/