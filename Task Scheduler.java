class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] farr= new int[26];
        for(char c : tasks){
            farr[c-'A']++;
        }
        Arrays.sort(farr);
        int max = farr[25]-1;
        int idle = max*n;
        for(int i = 24;i>=0;i--){
            idle = idle - Math.min(max,farr[i]);
        }
        return idle>0? idle+tasks.length:tasks.length;
    }
}
