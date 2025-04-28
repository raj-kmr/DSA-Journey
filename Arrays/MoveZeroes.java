// #Problem: https://leetcode.com/problems/move-zeroes/

/* 
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*/

/* Concept: 
To build this solution, I have first used pointer a start and end, and swap them when found any non-zero element in the end pointer with start pointer. 
but that solution wasn't optimaml and was taking too many operations
So, to make the solution more optimal, I have come up to replace end pointer from the current element index and,
rather swapping the values, I just move the value of non-zero element to start pointer,
and so the start pointer move on its own 
i make a condition to check if our start and end pointer have clashed or not, if not. 
I initialize the int on end pointer index as 0
and at last, increment the start pointer
*/

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        // Start pointer 
        int s = 0;

        // Traversing the whole array from 0 to n
        for (int i = 0; i < nums.length; i++) {
            // if current integer is non-zero
            if (nums[i] != 0) {
                //move the element at i to start pointer
                nums[s] = nums[i];
                // if start is not equal to current element
                if (s != i) {
                    //Initialize the current element as 0
                    nums[i] = 0;
                }
                // Increment start pointer
                s++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}


/*
 * Time complexity: We have using one for loop so time complexity is O(n).
 * 
 * Space complexity: We only used a int to store start pointer, So space is O(1);
*/