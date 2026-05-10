class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;

        int rowIndex = -1;

        while(l <= r){
            int mid = l + (r-l)/2;

            if(matrix[mid][0] == target){
                return true;
            }
            else if(matrix[mid][0] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        rowIndex = r;
        if(rowIndex < 0){
            return false;
        }
        int[] arr = matrix[rowIndex];

        l = 0;
        r = arr.length - 1;

        while(l <= r){
            int mid = l + (r-l)/2;

            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return false;
    }
}
