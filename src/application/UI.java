package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i =0; i<pieces.length;i++) {
			System.out.print((8-i)+ " ");
			for(int j=0; j<pieces.length;j++) {
				printPience(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	private static void printPience(ChessPiece piece) { //m�todo que imprimi uma pe�a 
		if(piece == null) //se essa pe�a for nulo
		{
			System.out.print("-"); //n�o tem pe�a
		}
		else {
			System.out.print(piece); //imprimi a pe�a
		}
		System.out.print(" ");
	}

}
