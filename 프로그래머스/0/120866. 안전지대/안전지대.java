class Solution {
    public int solution(int[][] board) {

        int answer = 0;
        int [][] arr =  new int [board.length][board[0].length];

        for(int i=0 ; i< board.length; i++){
            for(int j=0 ; j< board[i].length; j++){
                if (board[i][j] == 1){
                    findByBomb(i,j,arr);
                }
            }
        }

        for(int i=0 ; i< board.length; i++){
            for(int j=0 ; j< board[i].length; j++){
                if (arr[i][j] == 0){
                    answer++;
                }
            }
        }

        return answer;

    }
    void findByBomb(int i, int j, int[][] arr){

        int x = arr.length;
        int y = arr[0].length;
        arr[i][j] = 1;

        if (i > 0) arr[i-1][j] = 1;  // Top
        if (i < x - 1) arr[i+1][j] = 1;  // Bottom
        if (j < y - 1) arr[i][j+1] = 1;  // Right
        if (j > 0) arr[i][j-1] = 1;  // Left
        if (i > 0 && j > 0) arr[i-1][j-1] = 1;  // Top-left
        if (i > 0 && j < y - 1) arr[i-1][j+1] = 1;  // Top-right
        if (i < x - 1 && j > 0) arr[i+1][j-1] = 1;  // Bottom-left
        if (i < x - 1 && j < y - 1) arr[i+1][j+1] = 1;  // Bottom-right

    }
}