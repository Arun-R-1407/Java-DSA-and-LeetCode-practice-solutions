class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) { // 0 <= 3 → yes

            int mid = start + (end - start) / 2;
            // 0 + (3 - 0) / 2
            // 0 + 3 / 2
            // 0 + 1
            // mid = 1

            if (nums[mid] == target) {
                // nums[1] == 5
                // 3 == 5 → no

                return mid;
            }

            else if (nums[mid] < target) {
                // nums[1] < 5
                // 3 < 5 → yes

                start = mid + 1;
                // start = 1 + 1
                // start = 2
            }

            else {
                end = mid - 1;
            }
        }

        return start;
    }
}

//  Explanation 


/*I used Binary Search because the array is sorted. I maintain two pointers, 
start and end, and calculate the middle index in each iteration. If the middle element is equal to the target,
I return its index. If it is smaller, I search the right half, and if it is greater,
I search the left half. If the target is not found, start gives the correct insertion position.
The time complexity is O(log n), and the space complexity is O(1). */


//  time complexity 

/*In every iteration, Binary Search reduces the search space by half.

Therefore, the time complexity is O(log n).*/


//  space complexity 
/*
I only use a few variables such as `start`, `end`, and `mid`.
I don't use any extra array or data structure.

Therefore, the space complexity is O(1).
*/



// Optimization

/*
This solution is already optimal because Binary Search takes O(log n)
time and uses O(1) extra space.

There is no need for further optimization.
*/
