/* 
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

*/

class Solution {
    public int search(int[] nums, int target) { 
        int start = 0;
        int end = nums.length -1; // 6 -1  = 5

        while(start <= end){  // 0 <= 5 --> yes 

            int mid = start +(end-start) / 2; // mid  = 0+(5-0) --> mid  = 5

            if(target< nums[mid]){   // 5< 12 --> yes 

                end = mid - 1;  // end = 5-1 ---> end  = 4
            }
            else if(target> nums[mid]){

                start  = mid+1;
            }

            else{

                return mid;
            }
        }
        return -1;

}
}
// Explanation


/*
First, I create `start` and `end` to store the starting and ending indexes.

Then, I use a while loop while `start <= end`.

Inside the loop, I calculate the middle index using `mid`.

If the target is smaller than nums[mid], I search the left side
by updating `end = mid - 1`.

If the target is greater than nums[mid], I search the right side
by updating `start = mid + 1`.

If the target equals nums[mid], I return `mid`.

If the target is not found, I return -1.
*/

// Time Complexity

/*
In each iteration, Binary Search divides the search space into half.

Therefore, the time complexity is O(log n).
*/

// Space Complexity

/*
I only use the variables `start`, `end`, and `mid`.
I don't create any extra array or data structure.

Therefore, the space complexity is O(1).
*/




// Optimization

/*
// This solution is already optimal for the required O(log n) time
// complexity.
