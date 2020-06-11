package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces; //matriz de pe�as
	
	public Board() {
	}

	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	/**
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	
	public Piece piece (int row, int column) { //return a matriz pieces na linha row e na coluna column
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board.");
		}
			
		return pieces[row][column];
	}
	
	public Piece piece(Position position) { //retornar a pe�a pela posi��o
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {// metodo que vai definir a posi��o da pe�a
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		//vai pegar a matriz na posi��o dada e atribuir a ela a pe�a que foi informada.
		//a pe�a n�o esta mais na posi��o nula e sim na posi��o que foi informada.
		 piece.position = position;
		
	}
	private boolean positionExists (int row, int column) { //retorna as posi��es existentes no tabuleiro
		return row >=0 && row <= rows && column >=0 && column <= columns;
	}
	public boolean positionExists(Position position) { // retorna o m�todo acima com a posi��o informada
		return positionExists(position.getRow(), position.getColumn());
	}
	public boolean thereIsAPiece(Position position) {//retorna se a pe�a na posi��o desejada
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		return piece(position) != null;
	}
}
