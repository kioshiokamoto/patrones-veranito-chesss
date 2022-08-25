package ui.pieces;

import javax.swing.ImageIcon;

import ui.board.ChessGameBoard;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 * Represents a Queen game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class Queen
        extends ChessGamePiece {
    // ----------------------------------------------------------
    /**
     * Create a new Queen object.
     *
     * @param board
     *              the board the queen is on
     * @param row
     *              the row location of the queen
     * @param col
     *              the column location of the queen
     * @param color
     *              either GamePiece.WHITE, BLACK, or UNASSIGNED
     */
    public Queen(ChessGameBoard board, int row, int col, int color) {
        super(board, row, col, color);
    }

    /**
     * Calculates the possible moves for this Queen.
     * 
     * @param board the board to check on
     * @return ArrayList<> the list of moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
        return generateMoves(board, 8);
    }

    /**
     * Creates an icon for this piece depending on the piece's color.
     *
     * @return ImageIcon the ImageIcon representation of this piece.
     */
    @Override
    public ImageIcon createImageByPieceType() {
        return switch (getColorOfPiece()) {
            case ChessGamePiece.WHITE -> new ImageIcon(
                    getClass().getResource("../../resources/chessImages/WhiteQueen.gif"));
            case ChessGamePiece.BLACK -> new ImageIcon(
                    getClass().getResource("../../resources/chessImages/BlackQueen.gif"));
            default -> new ImageIcon(
                    getClass().getResource("../../resources/chessImages/default-Unassigned.gif"));
        };
    }

}