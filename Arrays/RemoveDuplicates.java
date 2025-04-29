// # Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/


/*
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

public class RemoveDuplicates {
    public static void main (String[] args){
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // Start pointer
        int i = 0;

        // Traversing loop from i + 1 to nums.length - 1
        for(int j = i+1; j < nums.length;){
            // check if element at i pointer is != to element at second pointer
            if(nums[i] != nums[j]){
                // Move the j pointer element to position of next element of pointer i
                nums[i+1] = nums[j];
                // Increase the pointer i
                i++;
            } else {
                // In else, increase the j pointer
                j++;
            }
        }

        // Print i + 1 because of starting location 0
        System.out.println(i+1);
    }
}

/* Time Complexity: We have used one for loop from the next element of first pointer to nums.length - 1, so it will be O(n),
 * 
 * Space Complexity: We have used only one integer to store our first pointer, which is constant. So, space complexity will be O(1);
*/