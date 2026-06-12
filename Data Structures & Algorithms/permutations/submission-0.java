class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        List<Integer> set = new ArrayList<>();

        rec(set, nums, visited, res);
        return res;
    }

    public void rec(List<Integer> set, int[] nums, boolean[] visited, List<List<Integer>> res){
        if(set.size() == nums.length){
            res.add(new ArrayList<>(set));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                set.add(nums[i]);
                visited[i] = true;
                rec(set, nums, visited, res);
                set.remove(set.size() - 1);
                visited[i] = false;
            }
        }
    }
}
