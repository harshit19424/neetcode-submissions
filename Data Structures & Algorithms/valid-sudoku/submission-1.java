class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c != '.'){
                    if(!seen.add(c + "at row" + i) ||
                    !seen.add(c + "at col" + j) ||
                    !seen.add(c + "at row" + i/3 + "at col" + j/3)){
                        return false;
                    } 
                }
            }
        }
        return true;
    }
}
