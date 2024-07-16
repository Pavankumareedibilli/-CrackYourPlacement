class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> collection = new HashSet<Integer>();
        for(int i =0 ;i<nums.length;i++){
            if(collection.contains(nums[i])){
                return nums[i];
            }
            else{
                collection.add(nums[i]);
            }
        }
        return 0;
    }
}
