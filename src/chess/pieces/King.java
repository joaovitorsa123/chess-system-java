package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K"; //como o nome da peça é King vai retornar K
	}

}
