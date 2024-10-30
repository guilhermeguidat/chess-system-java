package boardgame;
public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position pos) {
        return possibleMoves()[pos.getRow()][pos.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] possibleMoves = possibleMoves();
        for (int i = 0; i < possibleMoves.length; i++) {
            for (int j = 0; j < possibleMoves[i].length; j++) {
                if (possibleMoves[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
