public class Grid {
  private final char[][] grid;
  private final int rows;
  private final int cols;

  public Grid(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    this.grid = new char[rows][cols];

    // Initialize grid with empty spaces
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        grid[i][j] = ' ';
      }
    }
  }

  public char getCell(int row, int col) {
    return grid[row][col];
  }

  public void setCell(int row, int col, char symbol) {
    grid[row][col] = symbol;
  }

  public void printGrid() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(grid[i][j]);
        if (j < cols - 1) System.out.print("|");
      }
      System.out.println();
      if (i < rows - 1) System.out.println("-".repeat(cols * 2 - 1));
    }
  }

  public boolean isFull() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i][j] == ' ') return false;
      }
    }
    return true;
  }
}
