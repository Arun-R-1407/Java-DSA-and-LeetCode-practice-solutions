class Solution {
    public int splitArray(int[] nums, int m) {
        		int start = 0;
		int end = 0;
		for(int i  = 0;i< nums.length;i++) {
			start  = Math.max(start,nums[i]); // in the end of the loop this will contain the max item from the array
			end+=nums[i];
		}
		// binary search
		
		while(start<end) {
			//try for the middle as potential ans
			int mid = start  + (end - start)/2;
			//calculate how many pieces you can divide this in with this max sum
			int sum = 0;
			int pieces =1;
			
			for(int num: nums) {
				if(sum+ num > mid) {
					// you cannt add this in this subarray, make new ine
					// say you add this nums in new subarray, .. then sum  = num
					sum  =num;
					pieces++;
					
				} else {
				sum += num;
				}
			}
			
			if(pieces > m) {
				start = mid +1;
			}else {
				end = mid;
			}
		}
		return end;
		
	}
    }

/*
Approach: Binary Search + Greedy

First, I find the search space for the answer.

The minimum possible answer is the maximum element in the array because
we cannot split an individual element.

The maximum possible answer is the sum of all elements, which happens
when we consider the entire array as one subarray.

Then, I apply Binary Search on this range.

For every mid value, I consider mid as the maximum allowed sum for
each subarray.

I traverse the array and keep adding elements to the current subarray.

If adding the current element makes the sum greater than mid, I create
a new subarray and increase the pieces count.

After traversing the array:

- If pieces > m, it means mid is too small because we need more than
  m subarrays. So, I move the start pointer to mid + 1.

- Otherwise, mid is a possible answer, so I try to find a smaller
  possible answer by moving end to mid.

Finally, when start equals end, it represents the minimum possible
largest subarray sum.

Time Complexity: O(n * log(sum))
Space Complexity: O(1)

This is the optimal approach using Binary Search and Greedy.
*/
