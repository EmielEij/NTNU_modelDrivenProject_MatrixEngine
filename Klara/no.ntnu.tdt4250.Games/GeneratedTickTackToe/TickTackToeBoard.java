class TickTackToeBoard
{
	// Attribute declaration	
	private final char [][] board; 
	private int rows = 3;
	private int columns = 3;
	
	//Constructor
	TickTackToeBoard(){
		board = new char[rows][columns];
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
       	for (char[] row : board) {
      		for (char cell : row) {
       			 System.out.print(cell + " ");
      		}
      		System.out.println();
    }
    }
	public char[][] getBoard(){
		return board;
	}
    // dopPiece missing
	public boolean dropPiece(int column, char symbol) {
    if (column < 0 || column >= 3) {
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
