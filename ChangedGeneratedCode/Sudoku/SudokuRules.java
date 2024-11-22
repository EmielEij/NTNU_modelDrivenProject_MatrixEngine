class SudokuRules {
	// Attribute declaration
	private int rows = 4;
	private int columns = 4;

	public boolean checkWinner(char[][] board, char symbol) {
		// Check rows
		for (int i = 0; i < rows; i++) {
			boolean[] seen = new boolean[columns + 1];
			for (int j = 0; j < columns; j++) {
				if (board[i][j] != '.') {
					int num = board[i][j] - '0';
					if (num < 1 || num > columns || seen[num]) {
						return false;
					}
					seen[num] = true;
				} else {
					return false;
				}
			}
		}

		// Check columns
		for (int j = 0; j < columns; j++) {
			boolean[] seen = new boolean[rows + 1];
			for (int i = 0; i < rows; i++) {
				if (board[i][j] != '.') {
					int num = board[i][j] - '0'; 
					if (num < 1 || num > rows || seen[num]) {
						return false;
					}
					seen[num] = true;
				} else {
					return false;
				}
			}
		}

		int subGridSize = (int) Math.sqrt(rows); 
		for (int startRow = 0; startRow < rows; startRow += subGridSize) {
			for (int startCol = 0; startCol < columns; startCol += subGridSize) {
				boolean[] seen = new boolean[rows + 1];
				for (int i = 0; i < subGridSize; i++) {
					for (int j = 0; j < subGridSize; j++) {
						char cell = board[startRow + i][startCol + j];
						if (cell != '.') {
							int num = cell - '0';
							if (num < 1 || num > rows || seen[num]) {
								return false;
							}
							seen[num] = true;
						} else {
							return false;
						}
					}
				}
			}
		}
		return true;
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
