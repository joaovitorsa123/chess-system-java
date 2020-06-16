package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R"; //como o nome da peça é Rook vai retornar R
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean mat[][] = new  boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		//a cima
		p.setValues(position.getRow()-1,position.getColumn());
		//-1 porque estou analisando na posição da peça acima.
		//enquanto a posição p existir e não tiver uma peça la,enquanto a posição estiver vaga, eu vou marca-la como verdadeira
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha peça pode mover para ca
			//fazer a linha dessa posição andar mais uma pra cima
			p.setRow(p.getRow()-1); //
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha peça pode mover para ca
		}
		//esquerda
		p.setValues(position.getRow(),position.getColumn()-1);
		//-1 porque estou analisando na posição da peça acima.
		//enquanto a posição p existir e não tiver uma peça la,enquanto a posição estiver vaga, eu vou marca-la como verdadeira
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha peça pode mover para ca
			//fazer a linha dessa posição andar mais uma pra cima
			p.setColumn(p.getColumn()-1); //
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha peça pode mover para ca
		}
		//direita
		p.setValues(position.getRow(),position.getColumn()+1);
		//-1 porque estou analisando na posição da peça acima.
		//enquanto a posição p existir e não tiver uma peça la,enquanto a posição estiver vaga, eu vou marca-la como verdadeira
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha peça pode mover para ca
			//fazer a linha dessa posição andar mais uma pra cima
			p.setColumn(p.getColumn()+1); //
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		mat[p.getRow()][p.getColumn()] = true; //indica que a minha peça pode mover para ca
		}
		//abaixo
		p.setValues(position.getRow() +1,position.getColumn());
		//-1 porque estou analisando na posição da peça acima.
		//enquanto a posição p existir e não tiver uma peça la,enquanto a posição estiver vaga, eu vou marca-la como verdadeira
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha peça pode mover para ca
		//fazer a linha dessa posição andar mais uma pra cima
			p.setRow(p.getRow()+1); //
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha peça pode mover para ca
		}
				
		return mat;
	}


}
