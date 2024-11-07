public class TicTacToe extends Game {
  Grid grid = new Grid(3, 3);

  public TicTacToe() {
    super(3, 3); // Tic-Tac-Toe is a 3x3 grid
  }

  @Override
  public void makeMove(int row, int col) {
    if (grid.getCell(row, col) == ' ') {
      grid.setCell(row, col, currentPlayer);
      switchPlayer();
    }
  }

  @Override
  public boolean checkWin() {
    // Horizontal, vertical, and diagonal checks
    for (int i = 0; i < 3; i++) {
      if (grid.getCell(i, 0) == currentPlayer
          && grid.getCell(i, 1) == currentPlayer
          && grid.getCell(i, 2) == currentPlayer) {
        return true;
      }
      if (grid.getCell(0, i) == currentPlayer
          && grid.getCell(1, i) == currentPlayer
          && grid.getCell(2, i) == currentPlayer) {
        return true;
      }
    }
    if (grid.getCell(0, 0) == currentPlayer
        && grid.getCell(1, 1) == currentPlayer
        && grid.getCell(2, 2) == currentPlayer) {
      return true;
    }
    if (grid.getCell(0, 2) == currentPlayer
        && grid.getCell(1, 1) == currentPlayer
        && grid.getCell(2, 0) == currentPlayer) {
      return true;
    }
    return false;
  }

  // getCurrentPlayer
  public char getCurrentPlayer() {
    return currentPlayer;
  }
}
