package hw3;

public class Chessboard {
    public static void main(String[] args) {
        String [][] board = new String[8][8];
        String white = "W";
        String black = "B";

        for(int i =0; i<board.length;i++){
            for(int j = 0; j<board[i].length;j++){
                if(i %2 != 0){
                    if(j %2 != 0){
                        board[i][j] = white;
                    }else
                        board[i][j] = black;
                }else
                    if(j %2 == 0){
                        board[i][j] = white;
                    }else
                        board[i][j] = black;
                System.out.print(" "+board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
