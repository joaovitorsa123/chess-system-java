package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {//ser� o cora��o do sistema, nessa classe ter� as regras do jogo de xadrez
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
		
	}
	
	public ChessPiece[][] getPieces(){ //chesspiece para que o programa conhe�a apenas a camada de xadrez e n�o a de tabuleiro
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i =0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j); //matriz mat na linha i coluna j, receba board.piece
														   //ChessPiece - vai interpretar como uma pe�a de xadrez e n�o uma pe�a comum
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		//toPosition converte a posi��o do xadrez em posi��o de matriz
	}
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('a', 1, new King(board, Color.BLACK));
		placeNewPiece('a', 2, new King(board, Color.BLACK));
		placeNewPiece('a', 8, new King(board, Color.BLACK));
		
	}
	
}
