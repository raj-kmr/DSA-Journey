// #Problem:  https://leetcode.com/problems/merge-intervals/description/


/*
Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MergeIntervals {
    public int[][] merge(int[][] array) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        // If there are 0 or 1 intervals, nothing to merge
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals based on starting point
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        // List to store the merged intervals
        List<int[]> result = new ArrayList<>();

        // Start with the first interval
        int[] newInterval = intervals[0];
        result.add(newInterval);

        // Go through all intervals
        for (int[] interval : intervals) {
            // If intervals overlap, merge them
            if (interval[0] <= newInterval[1]) {
                // Update the end of the merged interval if needed
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                // No overlap, add the current interval to result
                newInterval = interval;
                result.add(newInterval);
            }
        }

        // Convert the list back to array and return
        return result.toArray(new int[result.size()][]);
    }
}

/*
Time complexity: Sorting the intervals takes O(n log n). Merging intervals takes O(n). Overall time  complexity: O(n log n)
 * 
Space complexity: We use an extra list to store the merged intervals, which can be at most O(n) in size. So, the overall space complexity is O(n).
*/