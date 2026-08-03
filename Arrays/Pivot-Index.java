// Input: nums = [1,7,3,6,5,6] -->Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
// Right sum = nums[4] + nums[5] = 5 + 6 = 11
// Output: 3

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;  
        for(int i = 0;i<nums.length;i++){

            total += nums[i]; // total = 0+nums[0] --> total = 1  --->total  = 28
        }
        int left =0;
        for(int i = 0;i<nums.length;i++){  
            int right  = total-nums[i]-left;  // right  = 28 -nums[0] - left --> right  = 27
            if(left==right){// 0 == 27 --> no 
                return i; // i
            }

            left += nums[i]; // left  = 0+1 --> left  = 1

        }
        return -1;
    
}
}
// Pattern: Prefix Sum

// First, we calculate the total sum of the array.
// Then, we keep track of the left sum while calculating the right sum.
// This is a Prefix Sum technique



/*  Explanation

The problem asks us to find the pivot index where the sum of the elements on the left is equal to the sum of the elements on the right. First, I calculate the total sum of the array. Then, I initialize a variable called left to store the left sum. I traverse the array again and calculate the right sum using the formula total - nums[i] - left. If the left sum is equal to the right sum, I return the current index. Otherwise, I update the left sum by adding the current element and continue the loop. If no pivot index is found, I return -1. The time complexity is O(n), and the space complexity is O(1)*/


// Time Complexity

/*
I use two `for` loops.

The first loop calculates the total sum of the array.

The second loop traverses the array again to find the pivot index.

Therefore, the time complexity is:

O(n) + O(n) = O(2n)

In Big-O notation, we ignore constants.
so,
Time Complexity = O(n)
*/




//  Space Complexity

/*
I only use a few integer variables:
`total`, `left`, `right`, and the loop variable `i`.

I do not create any extra array or data structure.

Therefore,

Space Complexity = O(1)
*/



//  It can be oopptimized?
/*
    No  

This solution is already optimal.

We must traverse the entire array at least once to calculate the total sum.

We also need another traversal to compare the left sum and the right sum for each index.

The algorithm uses constant extra space.

Therefore,

Time Complexity = O(n) (Optimal)

Space Complexity = O(1) (Optimal)
*/
