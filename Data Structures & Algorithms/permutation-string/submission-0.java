class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
        }

        int windowLen = s1.length();

        int l = 0;
        int r = windowLen - 1;
        while(r < s2.length()){
            String temp = s2.substring(l, r + 1);
            if(isAnagram(s1, temp)){
                return true;
            }
            l++;
            r++;
        }
        return false;
    }

    public boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int[] freq = new int[26];
        
        for(int i = 0; i < a.length(); i++){
            freq[a.charAt(i) - 'a']++;
        }

        for(int i = 0; i < b.length(); i++){
            freq[b.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
