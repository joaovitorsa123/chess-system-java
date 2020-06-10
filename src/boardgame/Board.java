package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces; //matriz de peças
	
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
	
	public Piece piece(Position position) { //retornar a peça pela posição
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {// metodo que vai definir a posição da peça
		pieces[position.getRow()][position.getColumn()] = piece;
		//vai pegar a matriz na posição dada e atribuir a ela a peça que foi informada.
		//a peça não esta mais na posição nula e sim na posição que foi informada.
		 piece.position = position;
		
	}
}
