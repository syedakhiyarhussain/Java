public class NQueens {
    public static void nqueens(char[][] board, int row){
        //base case that is all rows are filled and we crosse length of board in rows
        if(row==board.length){
            printBoard(board);
            System.out.println();
            return;
        }
        //kaam
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';//place the queen
                nqueens(board, row+1);//function call
                board[row][j]='x';//backtracking step (remove the queen)
            }
            
        }
    }
    public static boolean isSafe(char[][] board, int row, int col){

        //vertical upwards
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left upwards
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right upwards
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char[][] board){
        for(char arr[]: board){
            for(char c: arr){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        //initialize the board with x
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='x';
            }
        }
        nqueens(board, 0);
    }
        
}
