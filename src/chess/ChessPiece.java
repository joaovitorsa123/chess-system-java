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
		//verifica se existe uma peça adversaria nessa posição (position)
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		// variavel p vai receber a peça que estiver em position
		return p != null && p.getColor() != color;
		//se o p é diferente de nulo
		//p.getcolor é diferente da cor da eça que eu estou
	}
	

}
