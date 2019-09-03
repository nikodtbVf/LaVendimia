package TicTacToe;

public class Board {
	
	private int[][] movementsExample;
	
	public Board() {
		init();
	}
	
	public void init() {
		movementsExample =  new int[Constants.NUM_ROWS][Constants.NUM_COLS];
	}
	
	public void printBoard(char[][] movements) {
		for(int i = 0; i < Constants.NUM_ROWS; i++) {
			System.out.println("------------");
			for(int j = 0; j < Constants.NUM_COLS; j++) {
				System.out.print(movements[i][j] + "|");
			}
			System.out.println();
		}		
	}
	
	public void printBoard() {
		for(int i = 0; i < Constants.NUM_ROWS; i++) {
			System.out.println("------------");
			for(int j = 0; j < Constants.NUM_COLS; j++) {
				System.out.print(movementsExample[i][j] + "|");
			}
			System.out.println();
		}		
	}
	
	public void fillBoardExample() {
		int count = 1;
		for(int i = 0; i < Constants.NUM_ROWS; i++) {
			for(int j = 0; j < Constants.NUM_COLS; j++) {
				movementsExample[i][j] = count;
				count++;		
			}
		}
	}
	
	public boolean isValidCell(char[][] movements, int option) {
		for(int i = 0; i < Constants.NUM_ROWS; i++) {
			for(int j = 0; j < Constants.NUM_COLS; j++) {
				if (movementsExample[i][j]  == option) {
					return movements[i][j] != 'X' && movements[i][j] != 'O';
				}
			}
		}
		return false;
	}
	
	
	public void addMovement(int option, char playerChar, char[][] movements) {
		for(int i = 0; i < Constants.NUM_ROWS; i++) {
			for(int j = 0; j < Constants.NUM_COLS; j++) {
				if (movementsExample[i][j]  == option) {
					movements[i][j] = playerChar;
					return;
				}		
			}
		}
	}
	
	
	public int checkStatus(char charToCheck, char[][] movements) {
		  int status = Constants.UNDEFINED;	
		  for(int i = 0; i < Constants.NUM_ROWS; i++) {
			  if(checkRow(charToCheck, i, movements)) {
				  status = Constants.WIN;
				  return status;
			  } 
		  }
		  
		  for(int i = 0; i < Constants.NUM_COLS; i++) {
			  if(checkColumn(charToCheck, i, movements)) {
				  status = Constants.WIN;
				  return status;
			  }
		  }
		 
		  if(checkDiagonal(charToCheck, movements)) {
			  status = Constants.WIN;
			  return status;
		  }
		  
		  if(checkTieGame(movements)) {
			  status = Constants.TIE;
			  return status;
		  }
		  
		  return status;
	}
	
	public boolean checkRow(char charToCheck, int row, char[][] movements) {
		for(int i = 0; i < Constants.NUM_ROWS; i++) {
			  if(!(movements[row][i] == charToCheck)) {
				  return false;
			  }
		}
		return true;
	}
	
	public boolean checkColumn(char charToCheck, int column, char[][] movements) {
		for(int i = 0; i < Constants.NUM_COLS; i++) {
			if(!(movements[i][column] == charToCheck)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkDiagonal(char charToCheck, char[][] movements) {
		return 
				(movements[0][0] == charToCheck && 
				 movements[1][1] == charToCheck && 
				 movements[2][2] == charToCheck) || 
				(movements[0][2] == charToCheck &&
				 movements[1][1] == charToCheck &&
				 movements[2][0] == charToCheck);	
	}
	
	public boolean checkTieGame(char[][] movements) {
		for(int i = 0; i < Constants.NUM_ROWS; i++) {
			for(int j = 0; j < Constants.NUM_COLS; j++) {
				if(movements[i][j] != 'X' && movements[i][j] != 'O') {
					return false;
				}
			}
		}
		return true;
	}
}
