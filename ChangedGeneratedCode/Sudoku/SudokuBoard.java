class SudokuBoard
{
	// Attribute declaration	
	private final char [][] board; 
	private int rows = 4;
	private int columns = 4;
	
	//Constructor
	SudokuBoard(){
		board = new char[rows][columns];
		initializeBoard();
	}
	public void initializeBoard() {
	    for (int i = 0; i < rows; i++) {
	      for (int j = 0; j < columns; j++) {
	        board[i][j] = '.';
	      }
	    }

		board[0][1] = '4';
		board[1][3] = '4';
		board[2][2] = '2';
		board[2][3] = '3';
		board[3][0] = '2';
		board[3][1] = '3';

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
	public boolean dropPiece(int column, int row, char symbol, int val) {
    if (column < 0 || column >= 4) {
      System.out.println("Invalid column. Try again.");
      return false;
    }

	board[row][column] = Character.forDigit(val, 10);;

	return true;
  }
}
