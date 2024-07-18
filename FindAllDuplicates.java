class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         ArrayList<Integer> ans = new ArrayList<>();
         int j=0;
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                ans.add(nums[i]);
                j++;
            }else{
                set.add(nums[i]);
            }
         }
         return ans;
    }
}
