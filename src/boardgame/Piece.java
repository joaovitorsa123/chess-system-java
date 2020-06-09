package boardgame;

public class Piece {
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
	
	
	

}
