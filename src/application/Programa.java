package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

/**
 * @author vitor
 *
 */
public class Programa {

	public static void main(String[] args) {
	 ChessMatch chessmatch = new ChessMatch();
	 Scanner sc= new Scanner(System.in);
	 
	 while(true) {
		 UI.printBoard(chessmatch.getPieces());
		 System.out.println();
		 System.out.println("Source: ");
		 ChessPosition source = UI.readChessPosition(sc);
		 
		 System.out.println();
		 System.out.println("Target: ");
		 ChessPosition target = UI.readChessPosition(sc);
		 
		 ChessPiece captured = chessmatch.performChessMove(source, target);
		 
	 }
	
	}

}
