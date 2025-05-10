// #Problem: https://leetcode.com/problems/find-the-duplicate-number/

/*
Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
*/


public class FindDuplicateNumber {
    public static void main (String[] args){
        int[] nums = {1, 3, 4, 2, 2};

        // Tortoise moves by 1
        int slow = 0;

        // Hare moves by 2
        int fast = 0; 

        while(true){
            // array elements used as index to move
            slow = nums[slow];
            fast = nums[nums[fast]];

            // If slow and fast both comes to any same element
            if(slow == fast){
                // break
                break;
            }
        }

        // move a slow pointer to element 0 
        int slow2 = 0;

        while(true) {
            // And move both slow pointer by 1
            slow = nums[slow];
            slow2 = nums[slow2];

            // if condition goes right
            if(slow == slow2){
                // return slow 
                System.out.println(slow);
            }
        }
    }
}


/*
Time Complexity: In the first while loop, the slow and fast pointers move through the array to find the intersection point inside the cycle — this takes O(n) time in the worst case.
In the second while loop, both pointers converge to the entrance of the cycle (i.e., the duplicate number), which also takes O(n) time in the worst case.
So total time = O(n) + O(n) = O(n)

Space Complexity: The algorithm uses only a constant amount of extra space (just a few integer pointers), regardless of the input size.
*/