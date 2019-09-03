package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

	private char[][] movements;
	private Board board;
	private Player player1;
	private Player player2;
	private Scanner scan;
	
	
	public TicTacToe() {
		scan =  new Scanner(System.in);
		init();
	}
	
	public void init() {
	
	  boolean playingAgain = true;
	  while(playingAgain) {
		  board = new Board();
			movements = new char[Constants.NUM_ROWS][Constants.NUM_COLS];
			boolean invalidOption = true;	
			while(invalidOption) {
				System.out.println("Jugador 1 seleccione su ficha para jugar  X ó O");
				char option = scan.next().toUpperCase().charAt(0);
				if(option == 'X' || option == 'O') {
					player1 = new Player(option); 
					if(option == 'X') {
						player2 = new Player('O');
					}else {
						player2 = new Player('X');
					}
					
					System.out.println("Que inicie el juego.");
					invalidOption = false;	
					playGame();	
				}else {
					System.out.println("Opción Inválida. Intente nuevamente");
				}	
			}
			System.out.println("¿Desea jugar nuevamente?");
			System.out.println("1: Si");
			System.out.println("2: No");
			int option = scan.nextInt();
			if(option == 2) {
				playingAgain = false;
				System.out.println("Juego terminado");
			}
	  }
		
	}
	
	public void playGame() {
		board.fillBoardExample();
		System.out.println("Para elegir un movimiento, teclea un número del 1 al 9, como en el siguiente cuadro.");
		board.printBoard();
		
	
		int actualTurn = Constants.PLAYER_ONE;
		int statusGame = Constants.UNDEFINED;
		
		while(statusGame == Constants.UNDEFINED) {		
			System.out.println("TABLERO ACTUAL");
			board.printBoard(movements);
					
			int optionSelected = 0;
			boolean validOption = false;
			while(!validOption) {
				
				System.out.println("Selecciona tu movimiento jugador #" + actualTurn);
				optionSelected = scan.nextInt();
				if(optionSelected <= 0 && optionSelected >= 10){
					System.out.println("Opción inválida. Intente de nuevo");
				}else if(!board.isValidCell(movements, optionSelected)) {
					System.out.println("Opción Inválida. Casilla Ocupada, Intente nuevamente");
				}
				else {
					validOption = true;
				}
			}
					
			char charToMove = (actualTurn == Constants.PLAYER_ONE) ? player1.getCharSelected()  : player2.getCharSelected(); 
			board.addMovement(optionSelected, charToMove, movements);
			statusGame = board.checkStatus(charToMove, movements);
			
			if(statusGame == Constants.WIN) {
				String winPlayer =  (actualTurn == Constants.PLAYER_ONE) ? "1" : "2";
				System.out.println("Felicidades Jugador #" + winPlayer + " ganaste");
				System.out.println("TABLERO ACTUAL");
				board.printBoard(movements);
			}else if(statusGame == Constants.TIE) {
				System.out.println("Juego Empatado");
			}
			
			actualTurn = (actualTurn == Constants.PLAYER_ONE) ? Constants.PLAYER_TWO : Constants.PLAYER_ONE; 
		}
		
	}
}
