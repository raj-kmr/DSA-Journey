// #Problem: https://leetcode.com/problems/squares-of-a-sorted-array/description/

/*
Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*/

import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args){ 
        int[] nums = {-4, -1, 0, 3, 10};

         // Step 1: Square each element in the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];  // Replace each number with its square
        }

        // Step 2: Sort the squared numbers in non-decreasing order
        Arrays.sort(nums); 

        // Step 3: Return the sorted array of squares
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}


/*
Time complexity is O(n log n) due to the Arrays.sort() method.

Space complexity: O(1) extra space if we ignore the input and output. O(n) space used internally by Arrays.sort() in Java (it may use O(n) auxiliary space depending on the implementation).
*/
