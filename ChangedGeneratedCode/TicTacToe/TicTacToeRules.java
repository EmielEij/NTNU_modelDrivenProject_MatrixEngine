class TicTacToeRules
{
	// Attribute declaration	
	private int rows = 3;
	private int columns = 3;
	
    public boolean checkWinner(char[][] board, char symbol) {
    // check the rows for a win
    for(int i = 0; i < rows; i++) {
      if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
        return true;
      }
    }
    //check the columns for a win
    for(int i = 0; i < columns; i++) {
      if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
        return true;
      }
    }
    //check the diagonals for a win

    if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
      return true;
    }
    if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
      return true;
    }
    return false;
  }
    
	public boolean isBoardFull(char[][] board) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (board[i][j] == '.') {
          return false;
        }
      }
    }
    return true;
  }
}
