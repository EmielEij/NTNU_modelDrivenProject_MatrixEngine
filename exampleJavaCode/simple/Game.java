import java.util.Scanner;

public class Game {

  // The grid where the game is played, represented as a 2D array
  private char[][] grid;
  private final char PLAYER_X = 'X';
  private final char PLAYER_O = 'O';
  private char currentPlayer;
  private int rows, cols;

  // Constructor that allows dynamic grid size
  public Game(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    this.grid = new char[rows][cols];
    this.currentPlayer = PLAYER_X;

    // Initialize the grid with empty spaces
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        grid[i][j] = ' ';
      }
    }
  }

  public static void main(String[] args) {
    // Create a game with a dynamic grid size (e.g., 3x3 for TicTacToe)
    Game game = new Game(3, 3); // Change the size as needed

    // Start the game loop
    while (true) {
      game.printGrid();
      System.out.println("Player " + game.currentPlayer + ", enter your move (row, col): ");
      Scanner scanner = new Scanner(System.in);
      int row = scanner.nextInt();
      int col = scanner.nextInt();

      // Ensure valid move
      if (row < 0
          || row >= game.rows
          || col < 0
          || col >= game.cols
          || game.grid[row][col] != ' ') {
        System.out.println("Invalid move, try again.");
        continue;
      }

      // Update the grid with the player's move
      game.grid[row][col] = game.currentPlayer;

      // Check if the game is over
      if (game.isGameOver()) {
        game.printGrid();
        if (game.hasWinner()) {
          System.out.println("Player " + game.currentPlayer + " wins!");
        } else {
          System.out.println("It's a tie!");
        }
        break;
      }

      // Switch to the other player
      game.currentPlayer = (game.currentPlayer == game.PLAYER_X) ? game.PLAYER_O : game.PLAYER_X;
    }
  }

  // Print the grid to the console
  public void printGrid() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(grid[i][j]);
        if (j < cols - 1) {
          System.out.print("|");
        }
      }
      System.out.println();
      if (i < rows - 1) {
        for (int j = 0; j < cols - 1; j++) {
          System.out.print("-");
        }
        System.out.println();
      }
    }
  }

  // Check if the game is over
  public boolean isGameOver() {
    return hasWinner() || isFull();
  }

  // Check if there is a winner
  public boolean hasWinner() {
    // Check for horizontal wins
    for (int i = 0; i < rows; i++) {
      if (isRowWin(i)) {
        return true;
      }
    }

    // Check for vertical wins
    for (int i = 0; i < cols; i++) {
      if (isColWin(i)) {
        return true;
      }
    }

    // Check for diagonal wins
    if (isDiag1Win() || isDiag2Win()) {
      return true;
    }

    return false;
  }

  // Check if the given row has a winning combination
  private boolean isRowWin(int row) {
    for (int i = 1; i < cols; i++) {
      if (grid[row][i] != grid[row][0] || grid[row][i] == ' ') {
        return false;
      }
    }
    return true;
  }

  // Check if the given column has a winning combination
  private boolean isColWin(int col) {
    for (int i = 1; i < rows; i++) {
      if (grid[i][col] != grid[0][col] || grid[i][col] == ' ') {
        return false;
      }
    }
    return true;
  }

  // Check if the first diagonal has a winning combination
  private boolean isDiag1Win() {
    for (int i = 1; i < Math.min(rows, cols); i++) {
      if (grid[i][i] != grid[0][0] || grid[i][i] == ' ') {
        return false;
      }
    }
    return true;
  }

  // Check if the second diagonal has a winning combination
  private boolean isDiag2Win() {
    for (int i = 1; i < Math.min(rows, cols); i++) {
      if (grid[i][cols - i - 1] != grid[0][cols - 1] || grid[i][cols - i - 1] == ' ') {
        return false;
      }
    }
    return true;
  }

  // Check if there are no more empty spaces in the grid
  private boolean isFull() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i][j] == ' ') {
          return false;
        }
      }
    }
    return true;
  }
}
