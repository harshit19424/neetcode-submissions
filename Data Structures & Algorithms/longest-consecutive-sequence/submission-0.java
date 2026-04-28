class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int maxLen = Integer.MIN_VALUE;
        for(int i : nums){
            if(set.contains(i - 1)){
                continue;
            }
            else{
                int num = i + 1;
                int currLen = 1;

                while(true){
                    if(set.contains(num)){
                        currLen++;
                        num++;
                    }
                    else{
                        break;
                    }
                }
                maxLen = Math.max(currLen, maxLen);
            }
        }
        return maxLen;
    }
}
