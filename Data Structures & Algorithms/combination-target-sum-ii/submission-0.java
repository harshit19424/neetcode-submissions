class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, target, candidates, set, res);
        return res;
    }

    public void dfs(int i, int t, int[] nums, List<Integer> set, List<List<Integer>> res){
        if(t == 0){
            res.add(new ArrayList<>(set));
            return;
        }
        if(i < nums.length && t < 0){
            return;
        }
        if(i >= nums.length || t < 0){
            return;
        }

        set.add(nums[i]);
        dfs(i + 1, t - nums[i], nums, set, res);
        set.remove(set.size() - 1);
        while(i + 1 < nums.length && nums[i] == nums[i + 1]){
            i++;
        }
        dfs(i + 1, t, nums, set,res);
    }
}
