import java.util.List;
import java.util.ArrayList;

public class seminar1 {
    public static void main(String[] args) {
        Solution sol = new Solution(); 
        System.out.println(sol.solveNQueens(5));

    }
}
class Solution  {
    int [][] board;
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        board = new int [n][n];
        backtrack(0 , 0 , 1 );
        return ans;
    }
    
    private  void backtrack(int row , int col , int n) {
        if (n > board.length * board.length ){
            addboard();
            return;
        }
        if (n < board.length * board.length) {
            if (canPlace1(row , col )){
                row += 2 ;
                col += 1 ;
                board[row][col] = n;
                n += 1;
                backtrack(row , col , n);
                board[row][col] = 0;
            }
            if (canPlace2(row , col )){
                row += 1 ;
                col += 2 ;
                board[row][col] = n;
                n += 1;
                backtrack(row , col , n);
                board[row][col] = 0;
            }
            if (canPlace3(row , col )){
                row -= 1 ;
                col += 2 ;
                board[row][col] = n;
                n += 1;
                backtrack(row , col , n);
                board[row][col] = 0;
            }
            if (canPlace4(row , col )){
                row -= 2 ;
                col += 1 ;
                board[row][col] = n;
                n += 1;
                backtrack(row , col , n);
                board[row][col] = 0;
            }
            if (canPlace5(row , col )){
                row -= 2 ;
                col -= 1 ;
                board[row][col] = n;
                n += 1;
                backtrack(row , col , n);
                board[row][col] = 0;
            }
            if (canPlace6(row , col )){
                row -= 1 ;
                col -= 2 ;
                board[row][col] = n;
                n += 1;
                backtrack(row , col , n);
                board[row][col] = 0;
            }
            if (canPlace7(row , col )){
                row += 1 ;
                col -= 2 ; 
                board[row][col] = n;
                n += 1;
                backtrack(row , col , n);
                board[row][col] = 0;
            }
            if (canPlace8(row , col )){
                row += 2;
                col -= 1; 
                board[row][col] = n;
                n += 1;
                backtrack(row , col , n);
                board[row][col] = 0;
            }
        }
        return;
    }
    private  boolean canPlace1(int i , int j ) {
        if (i + 2 <= board.length - 1 && j + 1 <= board.length - 1 && board[i + 2][j + 1] == 0 ) {
            return true;
        }
        return false;
    }
    private  boolean canPlace2(int i , int j ) {
        if (i + 1 <= board.length - 1 && j + 2 <= board.length - 1 && board[i + 1][j + 2] == 0 ){
            return true;
        }
        return false;
    }
    private  boolean canPlace3(int i , int j ) {
        if (i - 1 <= board.length - 1 && i - 1 >= 0 && j + 2 <= board.length - 1 && board[i - 1][j + 2] == 0){
            return true;
        }
        return false;
    }
    private  boolean canPlace4(int i , int j ) {
        if (i - 2 <= board.length - 1 && i - 2 >= 0 && j + 1 <= board.length - 1 && board[i - 2][j + 1] == 0){
            return true;
        }
        return false;
    }
    private  boolean canPlace5(int i , int j ) {
        if (i - 2 <= board.length - 1 && i - 2 >= 0 && j - 1 <= board.length - 1 && j - 1 >= 0 && board[i - 2][j - 1] == 0){
            return true;
        }
        return false;
    }
    private  boolean canPlace6(int i , int j ) {
        if (i - 1 <= board.length - 1 && i - 1>= 0 && j - 2 <= board.length - 1 && j - 2 >= 0 && board[i - 1][j - 2] == 0){
            return true;
        }
        return false;
    }
    private  boolean canPlace7(int i , int j ) {
        if (i + 1 <= board.length - 1 && j - 2 <= board.length - 1 && j - 2 >= 0 && board[i + 1][j - 2] == 0){
            return true;
        }
        return false;
    }
    private  boolean canPlace8(int i , int j ) {
        if (i + 2 <= board.length - 1 && j - 1 <= board.length - 1 && j - 1>= 0 && board[i + 2][j - 1] == 0){
            return true;
        }
        return false;
    }
    private  void addboard() {
        List<String> b = new ArrayList<>();
        for (int i=0; i < board.length; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");;
            }
            System.out.println();
        }
        System.out.println();
    }
}
