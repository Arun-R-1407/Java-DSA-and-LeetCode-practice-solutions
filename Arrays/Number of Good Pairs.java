//Input: nums = [1,2,3,1,1,3]
//Output: 4


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n  = nums.length; // 6
         int ans = 0;
        for(int i  = 0;i<n;i++){ // i = 0  so i = 1
            int count = 0;
            for(int j = i+1;j<n;j++){  //j = 0+1 = j = 1 , so j = 2

            if(nums[i] == nums[j] && i<j){  // 0 == 1
                count++;    
              
            }
           
            }
            ans  += count;
             
        }
        return ans;
    }
}
