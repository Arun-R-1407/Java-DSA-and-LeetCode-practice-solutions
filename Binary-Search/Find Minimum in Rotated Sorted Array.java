class Solution {
    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {   // 0< 4

            int mid = start + (end - start) / 2; // mid = 0+(4 - 0) / 2 -- > 2

            if (nums[mid] > nums[end]) { // nums[2] > nums[4] -- > 5 > 2 -->yes
                start = mid + 1; // start = 3
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}

// Explanation

/*
I use Binary Search with start and end pointers.

If nums[mid] > nums[end],
the minimum is on the right side,
so start = mid + 1.

Otherwise, the minimum is at mid
or on the left side,
so end = mid.

Finally, start and end point to
the minimum element.
*/


// Time Complexity: O(log n)

// Space Complexity: O(1)

// Optimal: Yes, this is an optimal solution.
