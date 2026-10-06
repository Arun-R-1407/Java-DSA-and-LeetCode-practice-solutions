class Solution {
    public int mySqrt(int x) {

        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if ((long) mid * mid == x) {
                return mid;
            }
            if ((long) mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}


// Explanation

/*
I use Binary Search to find the integer square root of x.

I create two pointers, start and end.
Start begins from 1 and end is x.

I use ans to store the largest value whose square
is less than or equal to x.

In each iteration, I calculate the middle value.

If mid * mid is equal to x, I return mid because
I found the exact square root.

If mid * mid is less than x, I store mid in ans
and search the right side for a larger possible answer.

Otherwise, I search the left side.

Finally, I return ans.
*/


// Time Complexity

/*
O(log n)

Because Binary Search reduces the search space
by half in every iteration.
*/


// Space Complexity

/*
O(1)

Because I only use start, end, mid, and ans.
No extra data structure is used.
*/


// Optimal

/*
Yes, this is an optimal Binary Search solution.
*/
