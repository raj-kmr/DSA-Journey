// # Problem: https://leetcode.com/problems/product-of-array-except-self/

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]


public class ProductOfArray {
    public static  int[] main(String[] args) {
        // Input eample 1
        int[] nums = {1, 2, 3, 4};
        // taking a array to store the product
        int[] result = new int[nums.length];

        // Var to store the product of all elements to the left of the current element
        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            // Storing the product of all elements to the left of the curremt element
            result[i] = leftProduct;
            // updating the left product to include the current element
            leftProduct *= nums[i];
        }

        // doing same with the right product
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        // Returning the result array
        return result;
    }
}

/*
 * Time Complexit: O(n)
 * Space Complexity: O(1)
 */