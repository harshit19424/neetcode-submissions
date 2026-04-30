class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        //iterate hashmap
        for(int key : map.keySet()){
            int freq = map.get(key);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        //getting topK by iterating bucket backwards
        int[] res = new int[k];
        int ind = 0;

        for(int i = bucket.length - 1; i >= 0 && ind < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[ind] = num;
                    ind++;
                    if(ind == k){
                        break;
                    }
                }
            }
        }
        

        return res;
    }

}
