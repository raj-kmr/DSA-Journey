// # Problem: https://leetcode.com/problems/sort-an-array/
import  java.util.*;

public class MergeSort {
    public void main(String[] args){
        int[] arr = {1, 33, 44, 7, 0, 1, 2};
        int n = arr.length - 1;

        mergeSort(arr, 0, n);

        for(int i = 0; i <= n; i++){
            System.out.println(arr[i]);
        }
    }

    public void mergeSort(int[] arr, int start, int end){
        if(start == end) {
            return;
        }

        int mid = start + (end - start) / 2;
        // divide the left part
        mergeSort(arr, start, mid);
        // divide the right part
        mergeSort(arr, mid + 1, end);
        // Merging the array in sorted way
        merge(arr, start, mid, end);
    }

    public void merge(int[] arr, int start, int mid, int end){
        List<Integer> temp = new ArrayList<>();
        // starting point for the first sorted half
        int left = start;
        // starting point for the second sorted half
        int right = mid + 1;

        // while first array less than mid and second array less than end
        while(left <= mid && right <= end){
            // compare if left array element is small or right array's element
            // Add the element in temp array according to the small element
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If in upper condition, left side array still have elements
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        //If the right side have elements
        while(right <= end){
            temp.add(arr[right]);
            right++;
        }

        // Copy the temp array elements into the origianl array
        for(int i = start; i <= end; i++){
            arr[i] = temp.get(i - start);
        }
    }
}


// Time complexity: O(N*logN), merging two arrays take linear time and array is recursively divide into halves
// Space complexity: O(N), we use a temporary array to store elements in sorted order