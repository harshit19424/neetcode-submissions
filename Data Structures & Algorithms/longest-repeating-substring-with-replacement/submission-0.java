class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;

        int[] freq = new int[26];
        int maxLen = 0;
        int maxFreq = 0;
        while(r < s.length() && l < s.length()){
            char c = s.charAt(r);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);
            while((r - l + 1) - maxFreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, (r - l + 1));
            r++;
        }
        return maxLen;
    }
}
