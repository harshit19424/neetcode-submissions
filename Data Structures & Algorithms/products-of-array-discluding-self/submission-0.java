class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        for(int i = nums.length - 1; i > 0; i--){
            int prod = 1;
            for(int j = i - 1; j >= 0; j--){
                prod *= nums[j];
            }
            prefix[i] = prod;
        }

        prefix[0] = 1;


        for(int i = 0; i < nums.length - 1; i++){
            int prod = 1;
            for(int j = i + 1; j < nums.length; j++){
                prod *= nums[j];
            }
            suffix[i] = prod;
        }

        suffix[suffix.length - 1] = 1;

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}  
