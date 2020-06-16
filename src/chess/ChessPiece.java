package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class  ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		//verifica se existe uma pe�a adversaria nessa posi��o (position)
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		// variavel p vai receber a pe�a que estiver em position
		return p != null && p.getColor() != color;
		//se o p � diferente de nulo
		//p.getcolor � diferente da cor da e�a que eu estou
	}
	

}
