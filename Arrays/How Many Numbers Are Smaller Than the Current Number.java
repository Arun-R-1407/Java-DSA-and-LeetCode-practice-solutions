//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]



class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []ans =new int[nums.length] ; // input = [5] so ans [5]
         
        for(int i = 0;i<nums.length;i++){  // nums[i] = index 0,1,2,3,4,5
            int count  = 0; 
            for(int j = 0;j<nums.length;j++){ //nums[j] = index 0,1,2,3,4,5
                if(nums[j]<nums[i] && nums[j] != nums[i]){  // nums[j]<nums[i] = 
                    count++;
                   
                }
                 ans[i] = count;
            }
           
        }
        return ans;
    }
}
