class Solution {

    int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // If there is no pivot, array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If target is the pivot element
        if (nums[pivot] == target) {
            return pivot;
        }

        // Search in first half
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Search in second half
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }


    int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }


    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1; // 7-1 --> 6 

        while (start <= end) { // 0<=6

            int mid = start + (end - start) / 2; // mid = 0+ (6 - 0) / 2 --> 3 

            // Case 1: mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) { // 3< 6 && arr[3]> arr[3+1] -- > 
            // 3<6 && 7> 0 --> true
                return mid;
            }

            // Case 2: element before mid is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {  
           
                return mid - 1;
            }

            // Search left side
            if (arr[mid] <= arr[start]) { // 3< 4 --> yes
                end = mid - 1; // end = 3-1 aa--> 2
            }

            // Search right side
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}

// Explanation

/*
First, I find the pivot of the rotated sorted array.

The pivot is the largest element in the array,
where the next element is smaller.

For example:

[4, 5, 6, 7, 0, 1, 2]
          ↑
        Pivot

After finding the pivot:

1. If the pivot is -1, it means the array is not rotated.
   So, I perform Binary Search on the entire array.

2. If the target is equal to the pivot element,
   I return the pivot index.

3. If the target is greater than or equal to the first element,
   the target will be in the first sorted half.
   So, I perform Binary Search from index 0 to pivot - 1.

4. Otherwise, the target will be in the second sorted half.
   So, I perform Binary Search from pivot + 1 to the last index.

The findPivot() method also uses Binary Search to find
where the rotation happens.

Then binarySearch() searches for the target in the
correct sorted half.
*/


// Time Complexity

/*
findPivot() uses Binary Search, so it takes O(log n).

binarySearch() also takes O(log n).

Total:

O(log n) + O(log n)

We simplify it to:

O(log n)
*/


// Space Complexity

/*
I only use a few variables such as:

start
end
mid
pivot

I do not create any extra array or data structure.

Therefore:

Space Complexity = O(1)
*/


// Optimization

/*
This solution is optimal.

A normal Linear Search would take O(n) time.

But by using Binary Search, I can find the pivot
and search for the target in O(log n) time.
*/
