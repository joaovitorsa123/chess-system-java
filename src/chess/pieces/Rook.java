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
		return "R"; //como o nome da pe�a � Rook vai retornar R
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean mat[][] = new  boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		//a cima
		p.setValues(position.getRow()-1,position.getColumn());
		//-1 porque estou analisando na posi��o da pe�a acima.
		//enquanto a posi��o p existir e n�o tiver uma pe�a la,enquanto a posi��o estiver vaga, eu vou marca-la como verdadeira
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha pe�a pode mover para ca
			//fazer a linha dessa posi��o andar mais uma pra cima
			p.setRow(p.getRow()-1); //
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha pe�a pode mover para ca
		}
		//esquerda
		p.setValues(position.getRow(),position.getColumn()-1);
		//-1 porque estou analisando na posi��o da pe�a acima.
		//enquanto a posi��o p existir e n�o tiver uma pe�a la,enquanto a posi��o estiver vaga, eu vou marca-la como verdadeira
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha pe�a pode mover para ca
			//fazer a linha dessa posi��o andar mais uma pra cima
			p.setColumn(p.getColumn()-1); //
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha pe�a pode mover para ca
		}
		//direita
		p.setValues(position.getRow(),position.getColumn()+1);
		//-1 porque estou analisando na posi��o da pe�a acima.
		//enquanto a posi��o p existir e n�o tiver uma pe�a la,enquanto a posi��o estiver vaga, eu vou marca-la como verdadeira
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha pe�a pode mover para ca
			//fazer a linha dessa posi��o andar mais uma pra cima
			p.setColumn(p.getColumn()+1); //
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		mat[p.getRow()][p.getColumn()] = true; //indica que a minha pe�a pode mover para ca
		}
		//abaixo
		p.setValues(position.getRow() +1,position.getColumn());
		//-1 porque estou analisando na posi��o da pe�a acima.
		//enquanto a posi��o p existir e n�o tiver uma pe�a la,enquanto a posi��o estiver vaga, eu vou marca-la como verdadeira
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha pe�a pode mover para ca
		//fazer a linha dessa posi��o andar mais uma pra cima
			p.setRow(p.getRow()+1); //
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; //indica que a minha pe�a pode mover para ca
		}
				
		return mat;
	}


}
