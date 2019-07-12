package application;

import bordgame.Board;
import bordgame.Position;
import chess.ChessMatch;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());

	}

}
