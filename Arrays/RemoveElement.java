// # Problem: https://leetcode.com/problems/remove-element/

/*
Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/


public class RemoveElement{
    public static void main(String[] args){
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        
        /* More Optimized Solution */

        // This time, we take our start pointer as count too
        int s = 0;
        //Traverse the array and also using J as pointer to find any element not equal to VAL
        for(int j = 0; j < nums.length; j++){
            // if current element not equal to Val
            if(nums[j] != val){
                // Move that element on position start 
                nums[s] = nums[j];
                // Increment start also to maintain count and to get next location for element to move
                s++;
            }
        } 

        // printing the end count of elements that are not val in the array
        System.out.println("End count " +s);

        // Time complexity: O(n)
        // Space Complexity: O(1)



        // // Start pointer
        // int s = 0;
        // // end pointer
        // int e = nums.length -1;
        // //count to store k elements to return
        // int count = 0;

        // // Traversing the array from 0 to n-1
        // for(int i=0; i < nums.length; i++){
        //     // if start pointer is bigger than end pointer, Break
        //     if(s > e){
        //         break;
        //     }

        //     // Value at end pointer is equal to target value than we 
        //     // decrement the end pointer by 1
        //     if(nums[e] == val){
        //         e--;
        //         continue;
        //     }
            
        //     // if we have the same value at our start pointer than 
        //     // we swap values with end pointer
        //     if(nums[s] == val){
        //         int temp = nums[s];
        //         nums[s] = nums[e];
        //         nums[e] = temp;

        //         // Decrement the end pointer by one
        //         e--;
        //     }

        //     // Increment the start by 1, if we have or haven't the value at start pointer
        //     s++;
        // }

        // // Traversing the loop to count number of elements not equal to val
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != val){
        //         count++;
        //     }
        // }

        // // return count as answer
        // System.out.println(count);
    }
}

/* Time Complexity: We have used for loop two times in out solution but there's no nested loops so, time complexity will be O(n);
 * 
 * Space complexity: We have many integers to store start, end pointer and another to store but all of the integers constant So, space complexity will also be O(1);
*/