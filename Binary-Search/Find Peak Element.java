class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length -1; // 4-1 = 3
         
         while(start < end){ //  0< 3
            int mid = start + (end -  start) /2; // 0+ (3 - 0) / 2; -- > 2


            if(arr[mid]> arr [mid + 1]){ // arr[2] > arr[ 2+1] --> yes 
                end =  mid; // end = 2
            }

            else{
                start = mid +1; 
            }

         }
         return start;

    }
}

//   Explantion 
/*
I use Binary Search to find the peak element. I compare the middle element with the next element. If the middle element is greater, the peak can be on the left side, so I move the end pointer. Otherwise, the peak is on the right side, so I move the start pointer. Finally, both pointers meet at the peak element. */




 

// Time Complexity

/*
O(log n)

Because Binary Search reduces
the search space by half in
every iteration.
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
*/
