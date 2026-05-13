class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int row = 0; row < 9; row++) {

            HashSet<Character> seen = new HashSet<>();

            for(int col = 0; col < 9; col++) {

                char num = board[row][col];

                if(num == '.') continue;

                if(seen.contains(num))
                    return false;

                seen.add(num);
            }
        }

        // COLUMN CHECK
        for(int col = 0; col < 9; col++) {

            HashSet<Character> seen = new HashSet<>();

            for(int row = 0; row < 9; row++) {

                char num = board[row][col];

                if(num == '.') continue;

                if(seen.contains(num))
                    return false;

                seen.add(num);
            }
        }

        for(int outRow=0; outRow<9; outRow+= 3){
            for(int outCol=0; outCol<9; outCol+= 3){
                HashSet<Character> seen = new HashSet<>();

                for(int inRow=0; inRow<3; inRow++){
                    for(int inCol=0; inCol<3; inCol++){

                        if(board[outRow + inRow][outCol + inCol] == '.')
                            continue;
                        if(seen.contains(board[outRow + inRow][outCol + inCol]))
                            return false;

                        seen.add(board[outRow + inRow][outCol + inCol]);
                    }
                }
            }
        }
        return true;
    }
}
