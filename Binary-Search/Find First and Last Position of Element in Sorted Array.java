class Solution {
    public int[] searchRange(int[] nums, int target) {
      

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true); 
        
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;  // 5
        while(start <= end) { // 0 < = 5 --> yes
        int mid = start + (end - start) / 2; // mid  = 0+(5 - 0) / 2 -->mid = 2

            if (target < nums[mid]) { // 8 < 7 -- no check else if
                end = mid - 1;
            } else if (target > nums[mid]) {  // 8> 7 --> yes 
                start = mid + 1; // so start  = 2+1 = 3  
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    
}
}


// Explanation
/*
I use Binary Search to find the first and last position of the target.

First, I call search() with findStartIndex = true
to find the first occurrence of the target.

When the target is found, I store its index in ans.
Then I continue searching on the left side by using:
end = mid - 1

After finding the first occurrence, I call search() again
with findStartIndex = false to find the last occurrence.

When the target is found, I store its index in ans.
Then I continue searching on the right side by using:
start = mid + 1

Finally, I return the first and last positions in the ans array.
*/

// Time Complexity
/*
O(log n)

Binary Search is performed two times:
First occurrence  -> O(log n)
Last occurrence   -> O(log n)

Total = O(log n)
*/

// Space Complexity
/*
O(1)

Only a few variables like start, end, mid, and ans
are used. No extra data structure is required.
*/

// Optimal
/*
Yes, this is an optimal solution.
*/
