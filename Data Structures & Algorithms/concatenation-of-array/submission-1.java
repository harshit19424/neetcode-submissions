class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        
        int resLen = 2 * len;
        int[] res = new int[resLen];

        int i = 0;
        int j = 0;

        while(j < resLen){
            res[j] = nums[i];
            i++;
            j++;
            if(i >= len){
                i = 0;
            }
        }
        return res;
    }
}