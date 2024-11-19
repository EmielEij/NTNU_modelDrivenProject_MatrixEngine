public class GameBoard {
  private final char[][] board;
  private final int rows = 6;
  private final int columns = 7;

  public GameBoard() {
    board = new char[rows][columns];
    initializeBoard();
  }

  // Initialize board with empty cells
  public void å() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        board[i][j] = '.';
      }
    }
  }

  // Display the game board
  public void displayBoard() {
    for (char[] row : board) {
      for (char cell : row) {
        System.out.print(cell + " ");
      }
      System.out.println();
    }
  }

  // Drop a piece into a column
  public boolean dropPiece(int column, char symbol) {
    if (column < 0 || column >= columns) {
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

  // Get the game board
  public char[][] getBoard() {
    return board;
  }
}
