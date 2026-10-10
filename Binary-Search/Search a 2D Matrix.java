class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int row = mid / cols;

            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }


        return false;
    }
}   



// Interview Explanation
/*
I use Binary Search to search for the target in a 2D matrix.

First, I calculate the number of rows and columns.
Then, I treat the matrix as a single sorted 1D array
without creating a new array.

I initialize start to 0 and end to rows * cols - 1.

In each iteration, I calculate the middle index.
I convert the 1D index into a 2D position using:
row = mid / cols
col = mid % cols

If matrix[row][col] equals the target, I return true.

If the middle element is smaller than the target,
I search the right half by updating start = mid + 1.

Otherwise, I search the left half by updating end = mid - 1.

If the target is not found, I return false.
*/

// Time Complexity
/*
O(log(rows * cols))

Binary Search reduces the search space by half
in every iteration.
*/

// Space Complexity
/*
O(1)

I use only a few variables and do not create
an extra array or data structure.
*/

// Optimal
/*
Yes, this is an optimal solution for this problem.
It searches the matrix in O(log(rows * cols)) time
and O(1) extra space.
*/
