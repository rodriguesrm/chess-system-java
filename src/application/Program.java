package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc.nextLine());

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc.nextLine());

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

        }

//        UI.printBoard(chessMatch.getPieces());
    }
}