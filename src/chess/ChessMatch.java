package chess;

import boardgame.Board;

public class ChessMatch {//será o coração do sistema, nessa classe terá as regras do jogo de xadrez
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces(){ //chesspiece para ue o programa conheça apenas a camada de xadrez e não a de tabuleiro
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i =0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j); //matriz mat na linha i coluna j, receba board.piece
														   //ChessPiece - vai interpretar como uma peça de xadrez e não uma peça comum
			}
		}
		return mat;
	}
	
}
