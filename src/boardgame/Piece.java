package boardgame;

public abstract class Piece {
	protected Position position; //n�o � uma posi��o simples de xadrez, n�o quero que seja visivel na camada de xadrez
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
	protected Board getBoard() { //somente classes dentro do mesmo pacote e subclasses que v�o poder acessar o tabuleiro de uma pe�a
		return board;
	}

	//
	public abstract boolean[][] possibleMoves();
	
	//Retorna verdadeiro ou falso se essa pe�a � possivel mover para essa posi��o
	 public boolean possibleMoves(Position position) {
		 return possibleMoves()[position.getRow()][position.getColumn()];
		 //metodo retornando um m�todo abstrato
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
