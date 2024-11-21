class Connect4Player
{

	private String playerName;
	private char symbol;

	//Constructor
	Connect4Player(String n, char s){
	this.playerName = n;
	this.symbol = s;

	}
	public String getNamePlayer(){
		return playerName;
	}
	public String getNameSymbol(){
		return symbol;
	}
	}
	
}
