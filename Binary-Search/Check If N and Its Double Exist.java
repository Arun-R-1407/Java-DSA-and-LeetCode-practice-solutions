class Solution {
    public boolean checkIfExist(int[] arr) {
      
        for(int i  = 0;i<arr.length;i++){
        for(int j = 0;j<arr.length;j++){
           
         if(i != j && arr[i] == 2 * arr[j]) {
                return true;

            }
        }
        
        }
        return false;
    }
}

// Explanation

/*
I use two nested loops to compare every pair of elements in the array. The outer loop selects one element, 
and the inner loop compares it with all other elements. 
I check whether the indexes are different and whether one element is double the other. 
If I find such a pair, I return true. Otherwise, after checking all pairs, I return false.

The time complexity is O(n²) because I use two nested loops,
and the space complexity is O(1) because I don't use any extra data structure. 
This solution is correct, but it is not optimal because it can be improved to O(n) using a HashSet.*/
