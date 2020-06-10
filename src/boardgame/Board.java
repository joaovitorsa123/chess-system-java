package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces; //matriz de pe�as
	
	public Board() {
	}

	public Board(int rows, int columns) {
		super();
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

	/**
	 * @param rows the rows to set
	 */
	public void setRows(int rows) {
		this.rows = rows;
	}

	/**
	 * @return the columns
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * @param columns the columns to set
	 */
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece (int row, int column) { //return a matriz pieces na linha row e na coluna column
		return pieces[row][column];
	}
	
	public Piece piece(Position position) { //retornar a pe�a pela posi��o
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {// metodo que vai definir a posi��o da pe�a
		pieces[position.getRow()][position.getColumn()] = piece;
		//vai pegar a matriz na posi��o dada e atribuir a ela a pe�a que foi informada.
		//a pe�a n�o esta mais na posi��o nula e sim na posi��o que foi informada.
		 piece.position = position;
		
	}
}
