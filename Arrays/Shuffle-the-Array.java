// here we want to shuffle the array 
// ex x1=2, x2=5, x3=1, y1=3, y2=4, y3=7  --->x1,y1,x2,y2

class Solution {
    public int[] shuffle(int[] nums, int n) {  // n tells us where the second half of the array starts
       int []ans = new int[n*2];    // 6
       int index = 0; 
       for(int i = 0;i<n;i++){
        ans[index] = nums[i];  //ans[0]= nums[0] --> ans[0] = 2
        ans[index+1] =nums[i+n]; // ans[0+1] = nums[0+3] --> ans [1] = nums[3] --> ans[1]=3
        index +=2; // index = index+2--> index = 0+2 --> index = 2
       }
       return ans; // [2,3,5,1,4,7]

        }
    }


// Pattern: Array Traversal + Array Construction

//1. Array Traversal → We traverse the input array once
//2. Array Construction → We create a new array (ans) to store the shuffled result




// Explanation
 
/*
The problem asks us to shuffle the given array

First, I create a new integer array called `ans` with a size of `2 * n` to store the shuffled elements
Then, I create an integer variable called `index` and initialize it to 0
This variable keeps track of the current position in the `ans` array

Next, I use a `for` loop to traverse the first half of the `nums` array

In each iteration, I copy the current element from the first half (`nums[i]`) to `ans[index]`

Then, I copy the corresponding element from the second half (`nums[i + n]`) to `ans[index + 1]`

After storing both elements, I increase `index` by 2 so that the next pair is stored in the correct position

Finally, I return the `ans` array.
*/


//  Time Complexity

//i use a only one for loop so time complexity is O(n)



// space complexity

// i create a one extra array so Space Complexity is O(n)



// Can it be optimized?

/* 
          No

The problem requires us to return a new shuffled array.

Therefore, we must create another array.

The algorithm already traverses the array only once,
so the time complexity O(n) is optimal.

The space complexity O(n) is also optimal because the output
requires a new array.
*/
