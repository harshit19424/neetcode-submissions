class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int r = k - 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(r < nums.length){
            int max = findMax(nums, l, r);
            temp.add(max);
            l++;
            r++;
        }

        int[] res = new int[temp.size()];

        for(int i = 0; i < temp.size(); i++){
            res[i] = temp.get(i);
        }

        return res;
    }

    public int findMax(int[] nums, int start, int end){
        int max = Integer.MIN_VALUE;
        for(int i = start; i <= end; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
