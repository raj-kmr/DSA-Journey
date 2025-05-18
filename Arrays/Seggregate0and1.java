// #Problem: https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

/*
Examples :

Input: arr[] = [0, 0, 1, 1, 0]
Output: [0, 0, 0, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 1, 1].

Input: arr[] = [1, 1, 1, 1]
Output: [1, 1, 1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1, 1, 1]
*/


public class Seggregate0and1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1};

        // Taking a start pointer to track value to be swapped
        int s = 0;
        // For each element in the array
        for (int i = 0; i < arr.length; i++) {
            // when value is zero
            if (arr[i] == 0) {
                // swap the value from the value of start pointer
                int temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s++;
            }
        }
    }
}


/*
 * Time Complexity: We have been traversing the loop one time and we swap the element everytime if current element is 0. So, the time complexity will be O(n);
 * 
 * Space Complexity: We have only using a constant variable to store the pointer value, so the space complexity will be O(1)
*/