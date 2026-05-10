class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = temperatures.length;
        int[] res = new int[len];

        for(int i = len - 1; i >= 0; i--){
            map.put(temperatures[i], i);
            while(!stack.isEmpty() && temperatures[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = 0;
            }
            else{
                res[i] = map.get(stack.peek()) - i;
            }
            stack.push(temperatures[i]);
        }
        return res;
    }
}
