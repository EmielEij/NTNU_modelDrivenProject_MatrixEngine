import java.util.Scanner;
class SudokuLogic
{
	// Attribute declaration	
	private final SudokuRules rules; 
	private final SudokuBoard board;
	private final SudokuPlayer player1;
	private final SudokuPlayer player2;

	
	public SudokuLogic(SudokuPlayer p1, SudokuPlayer p2){
		this.player1 = p1;
		this.player2 = p2;
		board = new SudokuBoard();
		rules = new SudokuRules();
	}


	public void startGame(){
	    Scanner scanner = new Scanner(System.in);
    	SudokuPlayer currentPlayer = player1;

	 while (true) {
      board.displayBoard();
      System.out.println(currentPlayer.getNamePlayer() + "'s turn (" + currentPlayer.getNameSymbol() + ")");
      System.out.print("Enter a column (0-6): ");
      int column;

      try {
        column = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a number between 0 and 6.");
        scanner.next(); // Clear invalid input
        continue;
      }

      if (!board.dropPiece(column, currentPlayer.getNameSymbol())) {
        continue; // Retry the current player's turn
      }

      if (rules.checkWinner(board.getBoard(), currentPlayer.getNameSymbol())) {
        board.displayBoard();
        System.out.println("Congratulations, " + currentPlayer.getNamePlayer() + "! You win!");
        break;
      }

      if (rules.isBoardFull(board.getBoard())) {
        board.displayBoard();
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
	
	    SudokuPlayer player1 = new SudokuPlayer(player1Name, player1Symbol);
	    SudokuPlayer player2 = new SudokuPlayer(player2Name, player2Symbol);
	
	    SudokuLogic game = new SudokuLogic(player1, player2);
	    game.startGame();
	  }
	
}
