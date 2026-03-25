// #Problem: https://leetcode.com/problems/max-consecutive-ones/solutions/


public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1};

        int count = 0;
        int maxOne = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                count++;
            } else {
                count = 0;
            }

            if(maxOne < count){
                maxOne = count;
            }
        }

        System.out.println(maxOne);
    }
}


// Time complexity: O(n)
// Space complexity: O(1)