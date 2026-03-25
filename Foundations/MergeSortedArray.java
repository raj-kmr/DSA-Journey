// # Problem: https://leetcode.com/problems/merge-sorted-array/

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public  void main(String[] args){
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 5};
        int m = 6;
        int n = 3;

        mergeArray(nums1, nums2, m, n);
    }

    public void mergeArray(int[] nums1, int[] nums2, int m, int n){
        List<Integer> temp = new ArrayList<>();
        int left = 0;
        int right = 0;

        while(left < m && right < n){
            if(nums1[left] < nums2[right]){
                temp.add(nums1[left]);
                left++;
            } else {
                temp.add(nums2[right]);
                right++;
            }
        }

        while(left < m){
            temp.add(nums1[left]);
            left++;
        }

        while(right < n){
            temp.add(nums2[right]);
            right++;
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = temp.get(i);
        }
    }
}

// Time complexity: O(m + n)
// Space complexity: O(m + n)
