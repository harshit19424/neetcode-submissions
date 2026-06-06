class Solution {
    public int search(int[] nums, int target) {
        int pivot = -1;
        int n = nums.length;
        int l = 0;
        int r = n - 1;

        while(l < r){
            int mid = l + (r - l) / 2;

            if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        pivot = l;

        int l1 = 0;
        int r1 = pivot - 1;

        while(l1 <= r1){
            int mid = l1 + (r1 - l1) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                l1 = mid + 1;
            }
            else{
                r1 = mid - 1;
            }
        }

        int l2 = pivot;
        int r2 = n - 1;

        while(l2 <= r2){
            int mid = l2 + (r2 - l2) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                l2 = mid + 1;
            }
            else{
                r2 = mid - 1;
            }
        }
        return -1;
    }
}
