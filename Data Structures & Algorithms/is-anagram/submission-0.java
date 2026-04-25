class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] arr = new int[256];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch] += 1;
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            arr[ch] -= 1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                return false;
            }
        }
        return true;
    }
}
