public class GameRules {
  private final int rows = 6;
  private final int columns = 7;

  // Check if there's a winner
  public boolean checkWinner(char[][] board, char symbol) {
    // Check horizontal
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns - 3; j++) {
        if (board[i][j] == symbol
            && board[i][j + 1] == symbol
            && board[i][j + 2] == symbol
            && board[i][j + 3] == symbol) {
          return true;
        }
      }
    }

    // Check vertical
    for (int i = 0; i < rows - 3; i++) {
      for (int j = 0; j < columns; j++) {
        if (board[i][j] == symbol
            && board[i + 1][j] == symbol
            && board[i + 2][j] == symbol
            && board[i + 3][j] == symbol) {
          return true;
        }
      }
    }

    // Check diagonal (top-left to bottom-right)
    for (int i = 0; i < rows - 3; i++) {
      for (int j = 0; j < columns - 3; j++) {
        if (board[i][j] == symbol
            && board[i + 1][j + 1] == symbol
            && board[i + 2][j + 2] == symbol
            && board[i + 3][j + 3] == symbol) {
          return true;
        }
      }
    }

    // Check diagonal (bottom-left to top-right)
    for (int i = 3; i < rows; i++) {
      for (int j = 0; j < columns - 3; j++) {
        if (board[i][j] == symbol
            && board[i - 1][j + 1] == symbol
            && board[i - 2][j + 2] == symbol
            && board[i - 3][j + 3] == symbol) {
          return true;
        }
      }
    }

    return false;
  }

  // Check if the board is full
  public boolean isBoardFull(char[][] board) {
    for (int j = 0; j < columns; j++) {
      if (board[0][j] == '.') {
        return false;
      }
    }
    return true;
  }
}
