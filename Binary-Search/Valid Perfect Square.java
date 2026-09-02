class Solution {
    public boolean isPerfectSquare(int num) {
       if(num == 1){ // 1* 1 = 1 
        return true;
       }
       int left = 1;  
       int right = num/2;  // 16/2 = 8

       while(left <= right){//1 <= 8
        int mid = (left+right)/2; // mid = (1+8) / 2 --> 4
        long sq = (long)mid*mid; //sq = 4* 4 

        if(sq == num){ // 16 == 16
            return true;
        }
        else if(sq > num){
            right  = mid-1;
        }
        else{
            left = mid+1;
        }
       }
       return false;

    }
}

// Explantion
/*
I first check whether num is 1 because 1 is a perfect square.

Then, I use Binary Search to find whether there is a number whose
square is equal to num.

I calculate the middle value and find its square.

If the square is equal to num, I return true.

If the square is greater than num, I search on the left side.

If the square is smaller than num, I search on the right side.

If no number is found whose square equals num, I return false.
*/



// Time Complexity

// Binary Search reduces the search space by half in every iteration.
// Therefore, the Time Complexity is O(log n).  


// Space Complexity

// I only use a few variables such as left, right, mid, and sq.
// I do not use any extra data structure.

// Therefore, the Space Complexity is O(1).

// Optimization

// This solution is optimal because Binary Search finds the answer
// in O(log n) time.

// Using a linear approach would take O(n) time.

// Therefore, Binary Search is a more efficient solution.
