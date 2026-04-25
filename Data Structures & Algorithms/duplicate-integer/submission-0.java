class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i : nums){
            if(!map.contains(i)){
                map.add(i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}