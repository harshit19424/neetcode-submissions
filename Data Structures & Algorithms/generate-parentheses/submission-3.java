class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        rec(s, 0, 0, res, n);
        return res;
    }

    public void rec(StringBuilder s, int o, int c, List<String> res, int n){
        if(s.length() == 2 * n && (o == c && o == n)){
            res.add(s.toString());
            return;
        }
        if(o < n){                              //to make it valid open bracket should be the first one to append
            s.append('(');
            rec(s, o + 1, c, res, n);
            s.deleteCharAt(s.length() - 1);
        }
        if(c < o){                              //for valid parenthesis, close brackets should always be less than open brackets. Else it will not be valid for eg - ')())()'
            s.append(')');
            rec(s, o, c + 1, res, n);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
