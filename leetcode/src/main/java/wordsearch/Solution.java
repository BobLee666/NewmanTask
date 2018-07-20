package wordsearch;

class Solution {
    boolean[][] alreadyVisited;
    public boolean exist(char[][] board, String word) {
        alreadyVisited = new boolean[board.length][board[0].length];
        char[] searchChars = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(matchFind(board, searchChars, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean matchFind(char[][] board, char[] word,int start, int curI,int curJ){
        if(start == word.length){
            return true;
        }
        if(curI < 0 || curI >= board.length || curJ < 0 || curJ >= board[0].length){
            return false;
        }
        if(alreadyVisited[curI][curJ] == true){
            return false;
        }
        if(word[start] != board[curI][curJ]){
            return false;
        }
        alreadyVisited[curI][curJ] = true;
        boolean result = matchFind(board, word, start + 1, curI + 1, curJ)
                || matchFind(board, word, start + 1, curI, curJ + 1)
                || matchFind(board, word, start + 1, curI, curJ - 1)
                || matchFind(board, word, start + 1, curI - 1, curJ);
        if(result){
            return true;
        }
        alreadyVisited[curI][curJ] = false;
        return false;
    }
}