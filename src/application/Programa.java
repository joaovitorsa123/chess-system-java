package application;

import boardgame.Board;
import chess.ChessMatch;

/**
 * @author vitor
 *
 */
public class Programa {

	public static void main(String[] args) {
	 ChessMatch chessmatch = new ChessMatch();
	 UI.printBoard(chessmatch.getPieces());
	}

}
