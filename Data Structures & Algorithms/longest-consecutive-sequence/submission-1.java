class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int maxLen = 0;
        for(int i : set){
            if(!set.contains(i - 1)){
                int currLen = 1;
                int nextNum = i + 1;
                while(set.contains(nextNum)){
                    currLen++;
                    nextNum++;
                }
                maxLen = Math.max(currLen, maxLen);
            }
            
        }
        return maxLen;
    }
}
