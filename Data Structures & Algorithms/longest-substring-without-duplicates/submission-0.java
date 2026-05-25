class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();

        int l = 0;
        int r = 0;

        int max = 0;

        while(r < s.length()){
            while(seen.contains(s.charAt(r))){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            r++;
            max = Math.max(max, s.substring(l, r).length());
        }
        return max;
    }
}
