import java.util.Scanner;
class TickTackToeLogic
{
	// Attribute declaration	
	private final TickTackToeRules rules; 
	private final TickTackToeBoard board;
	private final TickTackToePlayer player1;
	private final TickTackToePlayer player2;

	
	public TickTackToeLogic(TickTackToePlayer p1, TickTackToePlayer p2){
		this.player1 = p1;
		this.player2 = p2;
		board = new TickTackToeBoard();
		rules = new TickTackToeRules();
	}


	public void startGame(){
	    Scanner scanner = new Scanner(System.in);
    	TickTackToePlayer currentPlayer = player1;

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
	
	    TickTackToePlayer player1 = new TickTackToePlayer(player1Name, player1Symbol);
	    TickTackToePlayer player2 = new TickTackToePlayer(player2Name, player2Symbol);
	
	    TickTackToeLogic game = new TickTackToeLogic(player1, player2);
	    game.startGame();
	  }
	
}
