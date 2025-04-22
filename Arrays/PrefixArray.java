// # Problem: https://leetcode.com/problems/find-pivot-index/description/

/*
Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
 * 
*/


import java.util.*;

public class PrefixArray {
    public static void main(String[] args){
        // Input: nums = [1, 2, 1, 2, 1]
        // Output: [2]

        // Input: nums = [2, 0, 0, 0, 2]
        // Output: [2]

        // Input: nums = [1, -1, 0]
        // Output: [2]

        // An example array to return every middle indexs after leftmost
        int[] nums = {2, 0, 0, 0, 2};

        // to store totalSum of our array so we can get rightSum easily
        int totalSum = 0;
        for(int num: nums){
            // accumulating sum of every integer in nums array 
            totalSum += num;
        }

        // Variable to store left side of array
        int leftSum = 0;

        // as result we have to take the List because we have to store more than one indexs
        List<Integer>  result = new ArrayList<>();

        // Iterating through nums array 
        for(int i=0; i < nums.length; i++){
            // getting rightSum by Subtracting totalSum from leftSum and current value in nums
            int rightSum = totalSum - leftSum - nums[i];

            // Checking if our rightSum and leftSum are equal
            if(rightSum == leftSum){
                // adding the index in list
                result.add(i);
            }
            // Adding current value of nums in leftSum every time until we got the rightSum or Iterate through all of the indexs
            leftSum += nums[i];
        }

        // checking if result is empty print -1 and if not print result
        if(result.isEmpty()){
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}

// Time complexity: We are going through nums array to get totalSum, which is O(n). Also, Iterating through indexs to get our result and it's also O(n). So, the time complexity of this code is O(n).

// Space complexity: for space complexity, we are creating two integers leftSum and totalSum, which is O(1), and a List which is array So, it will get to O(n). if we have to return only one index than it can go lower to O(1).

