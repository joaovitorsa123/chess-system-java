package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {//será o coração do sistema, nessa classe terá as regras do jogo de xadrez
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
		
	}
	
	public ChessPiece[][] getPieces(){ //chesspiece para que o programa conheça apenas a camada de xadrez e não a de tabuleiro
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i =0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j); //matriz mat na linha i coluna j, receba board.piece
														   //ChessPiece - vai interpretar como uma peça de xadrez e não uma peça comum
			}
		}
		return mat;
	}
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		//source - posição de origem
		//target - posição de destino
		Position source = sourcePosition.toPosition(); //converte para a posição da matriz
		Position target = targetPosition.toPosition(); //converte para a posição da matriz
		validateSourcePosition(source);
		Piece capturedPiece = makeMove(source,target); 
		//makemove- método responsável por realizaro movimento da peça
		return (ChessPiece)capturedPiece; 
		//converte para ChessPiece pois ela era do tipo Piece
		
	}
	
	private Piece makeMove(Position source, Position target) {
		Piece p = board.removePiece(source); //retira a peça da posição de origem
		Piece capturedPiece = board.removePiece(target); //remover a possivel peça que esta na posição de destino.
		board.placePiece(p, target); //coloca a peça p na posição de destino
		return capturedPiece;
	}
	
	private void validateSourcePosition(Position position) {
		if(!board.thereIsAPiece(position)) {
			throw new ChessException("There is no piece on source position.");
		}
		
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		//toPosition converte a posição do xadrez em posição de matriz
	}
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
		
	}
	
}
