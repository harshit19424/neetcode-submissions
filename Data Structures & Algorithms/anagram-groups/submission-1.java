class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> frequencyStringMap = new HashMap<>();
        for(String s : strs){
            String frequencyString = getFrequency(s);

            if(frequencyStringMap.containsKey(frequencyString)){
                frequencyStringMap.get(frequencyString).add(s);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                frequencyStringMap.put(frequencyString, list);
            }
        }
        return new ArrayList<>(frequencyStringMap.values());
    }

    public String getFrequency(String s){
        int [] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            arr[c - 'a'] += 1;
        }

        StringBuilder res = new StringBuilder();
        char c1 = 'a';

        for(int i : arr){
            res.append(c1);
            res.append(i);
            c1++;
        }
        return res.toString();
    }
}
