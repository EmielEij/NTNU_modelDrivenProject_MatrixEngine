import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Initialize the Tic-Tac-Toe game
    TicTacToe game = new TicTacToe();
    Scanner scanner = new Scanner(System.in);

    // Game loop
    while (!game.isGameOver()) {
      // Print the current grid state
      game.printGrid();

      // Prompt the current player for a move
      System.out.println(
          "Player " + game.getCurrentPlayer() + ", enter your move (row and column): ");
      int row = scanner.nextInt();
      int col = scanner.nextInt();

      // Make the move if the cell is empty, otherwise prompt for a new move
      if (row < 0 || row >= 3 || col < 0 || col >= 3 || game.grid.getCell(row, col) != ' ') {
        System.out.println("Invalid move. Try again.");
        continue;
      }

      game.makeMove(row, col);

      // Check if the game has a winner after each move
      if (game.checkWin()) {
        System.out.println("Player " + game.getCurrentPlayer() + " wins!");
        game.printGrid();
        break;
      }
    }

    // If the loop exits without a winner, it's a tie
    if (!game.checkWin()) {
      System.out.println("It's a tie!");
      game.printGrid();
    }

    scanner.close();
  }
}
