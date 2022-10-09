package application;

import chess.ChessMatch;
import chessconsole.UI;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());
	}
}
