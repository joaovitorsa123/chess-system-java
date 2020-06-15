package boardgame;

public abstract class Piece {
	protected Position position; //não é uma posição simples de xadrez, não quero que seja visivel na camada de xadrez
	private Board board;
	
	public Piece() {
		
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	/**
	 * @return the board
	 */
	protected Board getBoard() { //somente classes dentro do mesmo pacote e subclasses que vão poder acessar o tabuleiro de uma peça
		return board;
	}

	//
	public abstract boolean[][] possibleMoves();
	
	//Retorna verdadeiro ou falso se essa peça é possivel mover para essa posição
	 public boolean possibleMoves(Position position) {
		 return possibleMoves()[position.getRow()][position.getColumn()];
		 //metodo retornando um método abstrato
	 }
	
	//contar se existe pelo menos um movimento possivel
	 public boolean isThereAnyPossibleMove() {
		 boolean mat[][] = possibleMoves();
		 for(int i=0; i<mat.length; i++) {
			 for(int j=0; j<mat.length; j++) {
				 if(mat[i][j]) {
					 return true;
				 }
			 }
		 }
		 return false;
	 }
	

}
