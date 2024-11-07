public abstract class Game {
  protected Grid grid;
  protected char currentPlayer;

  public Game(int rows, int cols) {
    this.grid = new Grid(rows, cols);
    this.currentPlayer = 'X'; // Default starting player
  }

  public abstract void makeMove(int row, int col);

  public abstract boolean checkWin();

  public boolean isGameOver() {
    return checkWin() || grid.isFull();
  }

  public void switchPlayer() {
    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
  }

  public char getCurrentPlayer() {
    return currentPlayer;
  }

  public void printGrid() {
    grid.printGrid();
  }
}
