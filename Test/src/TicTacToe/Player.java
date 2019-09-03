package TicTacToe;

public class Player {

	private char charSelected;
	
	public Player(char charSelected) {
		this.charSelected = charSelected;
	}

	public char getCharSelected() {
		return charSelected;
	}

	public void setCharSelected(char charSelected) {
		this.charSelected = charSelected;
	}	
}
