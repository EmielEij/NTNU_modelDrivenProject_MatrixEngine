class Connect4Board
{
	// Attribute declaration	
	private final char [][] board; 
	private int rows = 6;
	private int columns = 7;
	
	//Constructor
	Connect4Board{
		board = new char67;
		initializeBoard();
	}
	public void initializeBoard() {
	    for (int i = 0; i < rows; i++) {
	      for (int j = 0; j < columns; j++) {
	        board[i][j] = '.';
	      }
	    }
	  }
	
	 public void displayBoard() {
                System.out.print(board[i][j] + " ");
            System.out.println();
    }
	public char[][] getBoard(){
		return matrixGames.impl.BoardImpl@426b6a74 (board: 0, rows: 6, columns: 7, boardName: Connect4);
	}
    // dopPiece missing
	public boolean dropPiece(int column, char symbol) {
    if (column < 0 || column >= 7) {
      System.out.println("Invalid column. Try again.");
      return false;
    }
    for (int i = rows - 1; i >= 0; i--) {
      if (board[i][column] == '.') {
        board[i][column] = symbol;
        return true;
      }
    }
    System.out.println("Column is full. Try a different one.");
    return false;
  }
}
