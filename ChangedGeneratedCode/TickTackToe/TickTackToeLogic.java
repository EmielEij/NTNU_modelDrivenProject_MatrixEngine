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
      System.out.print("Enter a location X(1-3)Y(1-3): X:Y");
      int X;
      int Y;

	  while (true) {
		System.out.print("Enter a location X(1-3)Y(1-3) in the format X:Y: ");
		String input = scanner.nextLine();

		try {
			// Split input by ":" to extract X and Y
			String[] parts = input.split(":");
			if (parts.length != 2) {
				throw new IllegalArgumentException("Input must be in the format X:Y");
			}

			// Parse X and Y values
			X = Integer.parseInt(parts[0]);
			Y = Integer.parseInt(parts[1]);

			// Check if X and Y are within the valid range
			if (X < 1 || X > 3 || Y < 1 || Y > 3) {
				throw new IllegalArgumentException("X and Y must be in the range 1-3");
			}

			// If we get here, the input is valid
			System.out.println("You entered a valid location: X = " + X + ", Y = " + Y);
			break; // Exit the loop as input is valid
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter a location like this X(1-3)Y(1-3): X:Y");
		}
	}
      if (!board.placeToken(X, Y, currentPlayer.getNameSymbol())) {
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
	
	    TickTackToePlayer player1 = new TickTackToePlayer("X", 'X');
	    TickTackToePlayer player2 = new TickTackToePlayer("O", 'O');
	
	    TickTackToeLogic game = new TickTackToeLogic(player1, player2);
	    game.startGame();
	  }
	
}
