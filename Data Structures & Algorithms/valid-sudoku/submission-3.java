class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        
        
        

        for(int i=0; i< 9; i++){
            HashSet<Character> rowSet = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j]=='.')
                    continue;
                if(rowSet.contains(board[i][j]))
                    return false;
                rowSet.add(board[i][j]);
            }
        }

        for(int i=0; i< 9; i++){
            HashSet<Character> column = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i]=='.')
                    continue;
                if(column.contains(board[j][i]))
                    return false;
                column.add(board[j][i]);
            }
        }

        for(int i=0; i<9; i++){
            HashSet<Character> square = new HashSet<>();
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){

                    int row = (i/3)*3 + j;
                    int col = (i%3)*3 + k;

                    if(board[row][col]=='.')
                        continue;
                    if(square.contains(board[row][col]))
                        return false;
                    square.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
