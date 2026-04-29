class Solution {
    public int trap(int[] height) {

        int n = height.length;
        if (n == 0) return 0;

        int[] maxRight = new int[n];
        int[] maxLeft = new int[n];

        // maxLeft
        maxLeft[0] = 0;
        for(int i = 1; i < n; i++){
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i - 1]);
        }

        // maxRight
        maxRight[n - 1] = 0;
        for(int i = n - 2; i >= 0; i--){
            maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.max(0, Math.min(maxLeft[i], maxRight[i]) - height[i]);
        }

        return sum;
    }
}