class Solution {
    public int majorityElement(int[] nums) {
        int mc = -1;
        for(int i =0;i<nums.length;i++){
            int count=0;
            int target=nums[i];
            for(int j = 0;j<nums.length;j++){
                if(nums[j]==target) {
                    count=count+1;
                    mc=count;
                };
            }
            if(count>nums.length/2) return target;
        }
        return mc;
    }
}
