class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> freqMap = new HashMap<>();

        List<List<String>> res = new ArrayList<>();

        for(String s : strs){
            String freqString = getFrequency(s);

            List<String> temp = new ArrayList<>();
            
            if(!freqMap.containsKey(freqString)){
                temp.add(s);
                freqMap.put(freqString, temp);
            }
            else{
                freqMap.get(freqString).add(s);
            }
        }
        return new ArrayList<>(freqMap.values());

    }

    public String getFrequency(String s){
        char c = 'a';
        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            count[ch - 'a'] += 1;
        }
        StringBuilder resString = new StringBuilder();

        for(int i = 0; i < 26; i++){
            resString.append(c);
            resString.append(count[c - 'a']);
            c++;
        }

        return resString.toString();
    }
}
