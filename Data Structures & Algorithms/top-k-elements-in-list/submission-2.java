class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //Step1: Frequency Map
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        //Step2: Bucket array
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        
        for(int key : freq.keySet()){
            int f = freq.get(key);

            if(bucket[f] == null){
                bucket[f] = new ArrayList<>();
            }

            bucket[f].add(key);
        }


        //Step3: Collect top K
        int[] result = new int[k];
        int ind = 0;

        for(int i = bucket.length - 1; i >= 0 && ind < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    result[ind] = num;
                    ind++;
                    if(ind == k){
                        break;
                    }
                }
            }
        }

        return result;
    }

}
