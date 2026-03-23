// #Problem: https://leetcode.com/problems/binary-search/

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int start = 0;
        int end = arr.length -1;
        int mid = start + (end - start) / 2;

        while(start <= end){
            if(target == arr[mid]){
                System.out.println(mid);
            }

            if(target > arr[mid]) {
                start = mid + 1;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }
        }

        System.out.println(-1);
    }
}

// Time complexity: O(logN)
// Space complexity: O(1)

