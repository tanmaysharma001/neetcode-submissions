class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i= 0; i<9; i++){
            Set<Character> seen = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j]=='.')
                    continue;
                if(seen.contains(board[i][j]))
                    return false;
                seen.add(board[i][j]);
            }
        }

        for(int i= 0; i<9; i++){
            Set<Character> seen = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i]=='.')
                    continue;
                if(seen.contains(board[j][i]))
                    return false;
                seen.add(board[j][i]);
            }
        }        

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                Set<Character> seen = new HashSet<>();

                for(int k=0; k<3; k++){
                    for(int l=0; l<3; l++){
                        if(board[i+k][j+l]=='.')
                            continue;
                        if(seen.contains(board[i+k][j+l]))
                            return false;
                        seen.add(board[i+k][j+l]);
                    }
                }
            }
        }

        return true;
    }
}
