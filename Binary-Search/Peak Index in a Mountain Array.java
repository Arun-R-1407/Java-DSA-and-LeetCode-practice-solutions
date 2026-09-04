class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;

        int end = arr.length -1;  // 3-1 -->2
         
         while(start < end){ // 0<2 --> yes 

            int mid = start + (end -  start) /2; // 0+(2-0)/2 --> 1

            if(arr[mid]> arr [mid + 1]){ // arr[1]> arr[2]--  yes 
                end =  mid; // end  = 1
            }
            else{

                start = mid +1;
            }
         }
         return start;
}}


//  Explanation

/*
First, I create two pointers, start and end.
The end pointer stores the last index of the array.

Then, I use Binary Search to find the peak index
in the mountain array.

I calculate the middle index and compare the middle
element with the next element.

If the middle element is greater than the next element,
the peak can be at mid or on the left side,
so I move end = mid.

Otherwise, the peak is on the right side,
so I move start = mid + 1.

Finally, when the loop ends, start and end point
to the peak element, so I return start.
*/

// Time Complexity

/*
O(log n)

Because Binary Search reduces the
search space by half in every iteration.
*/


// Space Complexity

/*
O(1)

Because we only use a few variables
such as start, end, and mid.
No extra data structure is used.
*/


// Optimal

/*
Yes, this is an optimal solution.

A linear search takes O(n),
but Binary Search finds the peak
in O(log n).
*/
