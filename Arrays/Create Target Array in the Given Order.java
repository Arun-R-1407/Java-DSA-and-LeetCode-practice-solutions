/* Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2] */


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();  //[ ]
        for(int i = 0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        int ans[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i]  = target.get(i);
        }
        return ans;
    }
}
