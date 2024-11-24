class TicTacToeRules
{
	// Attribute declaration	
	private int rows = 3;
	private int columns = 3;
	
    public boolean checkWinner(char[][] board, char symbol) {
      
    return false;
  }
    
	public boolean isBoardFull(char[][] board) {
    for (int j = 0; j < columns; j++) {
      if (board[0][j] == '.') {
        return false;
      }
    }
    return true;
  }
}
