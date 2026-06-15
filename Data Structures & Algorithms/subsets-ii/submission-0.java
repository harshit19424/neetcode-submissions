class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        List<Integer> set = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, set, res);
        return new ArrayList<>(res);
    }

    public void backtrack(int i, int[] nums, List<Integer> set, HashSet<List<Integer>> res){
        if(i == nums.length){
            res.add(new ArrayList<>(set));
            return;
        }

        set.add(nums[i]);
        backtrack(i + 1, nums, set, res);
        set.remove(set.size() - 1);
        backtrack(i + 1, nums, set, res);
    }
}
