class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        rec(s, 0, 0, res, n);
        return res;
    }

    public void rec(StringBuilder s, int o, int c, List<String> res, int n){
        if(s.length() == 2 * n){
            res.add(s.toString());
            return;
        }
        if(o < n){
            s.append('(');
            rec(s, o + 1, c, res, n);
            s.deleteCharAt(s.length() - 1);
        }
        if(c < o){
            s.append(')');
            rec(s, o, c + 1, res, n);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
