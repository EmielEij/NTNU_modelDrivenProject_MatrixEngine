class Connect4Rules
{
	// Attribute declaration	
	private int rows = 6;
	private int columns = 7;
	
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
