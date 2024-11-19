import java.util.Scanner;

public class GameLogic {
  private final GameBoard gameBoard;
  private final GameRules gameRules;
  private final Player player1;
  private final Player player2;

  public GameLogic(Player player1, Player player2) {
    this.gameBoard = new GameBoard();
    this.gameRules = new GameRules();
    this.player1 = player1;
    this.player2 = player2;
  }

  public void startGame() {
    Scanner scanner = new Scanner(System.in);
    Player currentPlayer = player1;

    while (true) {
      gameBoard.displayBoard();
      System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
      System.out.print("Enter a column (0-6): ");
      int column;

      try {
        column = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a number between 0 and 6.");
        scanner.next(); // Clear invalid input
        continue;
      }

      if (!gameBoard.dropPiece(column, currentPlayer.getSymbol())) {
        continue; // Retry the current player's turn
      }

      if (gameRules.checkWinner(gameBoard.getBoard(), currentPlayer.getSymbol())) {
        gameBoard.displayBoard();
        System.out.println("Congratulations, " + currentPlayer.getName() + "! You win!");
        break;
      }

      if (gameRules.isBoardFull(gameBoard.getBoard())) {
        gameBoard.displayBoard();
        System.out.println("The game is a draw!");
        break;
      }

      // Switch player
      currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    scanner.close();
  }

  public static void main(String[] args) {
    System.out.println("Welcome to Connect Four!");
    Scanner scanner = new Scanner(System.in);

    // Get player details
    System.out.print("Enter Player 1 name: ");
    String player1Name = scanner.nextLine();
    System.out.print("Choose a symbol for Player 1: ");
    char player1Symbol = scanner.nextLine().charAt(0);

    System.out.print("Enter Player 2 name: ");
    String player2Name = scanner.nextLine();
    System.out.print("Choose a symbol for Player 2: ");
    char player2Symbol = scanner.nextLine().charAt(0);

    Player player1 = new Player(player1Name, player1Symbol);
    Player player2 = new Player(player2Name, player2Symbol);

    GameLogic game = new GameLogic(player1, player2);
    game.startGame();
  }
}
