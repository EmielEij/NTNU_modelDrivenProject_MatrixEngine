import java.util.Scanner;
class Connect4Logic
{
	// Attribute declaration	
	private final Connect4Rules rules; 
	private final Connect4Board board;
	private final Connect4Player player1;
	private final Connect4Player player2;

	
	public Connect4Logic(Connect4Player p1, Connect4Player p2){
		this.player1 = p1;
		this.player2 = p2;
		boardName = new Connect4Board boardName();
		rules = new Connect4Rules();
	}


	public void startGame(){
	    Scanner scanner = new Scanner(System.in);
    	Connect4Player currentPlayer = player1;

	 while (true) {
      board.displayBoard();
      System.out.println(currentPlayer.getNamePlayer() + "'s turn (" + currentPlayer.getSymbolPlayer() + ")");
      System.out.print("Enter a column (0-6): ");
      int column;

      try {
        column = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a number between 0 and 6.");
        scanner.next(); // Clear invalid input
        continue;
      }

      if (!board.dropPiece(column, currentPlayer.getSymbolPlayer())) {
        continue; // Retry the current player's turn
      }

      if (gameRules.checkWinner(board.getBoard(), currentPlayer.getSymbolPlayer())) {
        board.displayBoard();
        System.out.println("Congratulations, " + currentPlayer.getNamePlayer() + "! You win!");
        break;
      }

      if (gameRules.isBoardFull(board.getBoard())) {
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
	
	    Connect4Player player1 = new Player(player1Name, player1Symbol);
	    Connect4Player player2 = new Player(player2Name, player2Symbol);
	
	    GameLogic game = new GameLogic(player1, player2);
	    game.startGame();
	  }
	
}
