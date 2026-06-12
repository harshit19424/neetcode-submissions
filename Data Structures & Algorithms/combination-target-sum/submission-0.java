class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        dfs(0, target, set, nums, res);
        return res;
    }

    public void dfs(int i, int t, List<Integer> set, int[] nums, List<List<Integer>> res){
        if(i >= nums.length && t == 0){
            res.add(new ArrayList<>(set));
            return;
        }
        if(i >= nums.length || t < 0){
            return;
        }
        set.add(nums[i]);
        dfs(i, t - nums[i], set, nums, res);
        set.remove(set.size() - 1);
        dfs(i + 1, t, set, nums, res);
    }
}
