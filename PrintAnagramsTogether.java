class Solution {
      public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap< String , List<String>> ans = new  HashMap<>();
        for( int i = 0; i<strs.length;i++){
            String sorted= sortString( strs[i]);
            if(ans.containsKey(sorted)){
                ans.get(sorted).add(strs[i]);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                ans.put(sorted,temp);
            }
        }
        List<List<String>> finalans = new ArrayList<>();
        for(List<String> t : ans.values()){
            finalans.add(t);
        }
        return finalans;
    }
}
