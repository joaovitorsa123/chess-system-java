package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition: Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	protected Position toPosition() { //vai converter a chessposition para a position normal
		return new Position(8-row,column-'a');
		//8-(posi��o do xadrex)
		//(coluna do xadrez) - 'a'
	}
	protected static ChessPosition fromPosition(Position position) { //vai converter a posi��o da matriz para a posi��o de xadrez
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
		
	}

	@Override
	public String toString() {
		return "" + column +  row;
	}
	
	
	

}
