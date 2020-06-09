package boardgame;

public class Piece {
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
	
	
	

}
