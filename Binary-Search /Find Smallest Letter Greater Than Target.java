class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;  

        int end = letters.length-1;  // 3-1 = 2

 
        while(start<= end){ // 0<= 2 -->yes

            int mid = start + (end  - start) /2;   // mid = 0+(2-0)/ 2 --> mid = 1;

            if(target<letters[mid]){ // a < f -- yes

                end = mid -1; // end = 1-1 --> end = 0; 
            }

            else{

                start = mid+1;
            }
        }

      return letters[start % letters.length]; 
        
    }
}

// Explanation

/*
First, I initialize start and end pointers.

Then, I use Binary Search to find the smallest letter
greater than the target.

If the target is smaller than the middle letter, I search
on the left side. Otherwise, I search on the right side.

After the loop, start points to the next greatest letter.

Finally, I use modulo (%) to handle the circular case and
return the first letter if no greater letter exists.
*/


// Time Complexity

// Binary Search divides the search space by half each time.
// Therefore, Time Complexity is O(log n).


// Space Complexity

// I only use a few variables and no extra data structure.
// Therefore, Space Complexity is O(1).


// Optimization

// This solution is optimal because Binary Search gives O(log n)
// time complexity, and we cannot improve the space complexity
// beyond O(1).
