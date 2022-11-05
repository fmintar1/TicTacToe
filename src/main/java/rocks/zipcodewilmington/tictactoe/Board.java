package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX () {
        if (matrix[0][0].equals('X') &&
                matrix[0][1].equals('X') &&
                matrix[0][2].equals('X')) {
            return true;
        }
        if (matrix[1][0].equals('X') &&
                matrix[1][1].equals('X') &&
                matrix[1][2].equals('X')) {
            return true;
        }
        if (matrix[2][0].equals('X') &&
                matrix[2][1].equals('X') &&
                matrix[2][2].equals('X')) {
            return true;
        }
        if (matrix[0][0].equals('X') &&
                matrix[1][1].equals('X') &&
                matrix[2][2].equals('X')) {
            return true;
        }
        if (matrix[0][0].equals('X') &&
                matrix[1][0].equals('X') &&
                matrix[2][0].equals('X')) {
            return true;
        }
        if (matrix[0][1].equals('X') &&
                matrix[1][1].equals('X') &&
                matrix[2][1].equals('X')) {
            return true;
        }
        if (matrix[0][2].equals('X') &&
                matrix[1][2].equals('X') &&
                matrix[2][2].equals('X')) {
            return true;
        }
        if (matrix[0][2].equals('X') &&
                matrix[1][1].equals('X') &&
                matrix[2][0].equals('X')) {
            return true;
        }
        return false;
    }
    public Boolean isInFavorOfO () {
        if (matrix[0][0].equals('O') &&
                matrix[0][1].equals('O') &&
                matrix[0][2].equals('O')) {
            return true;
        }
        if (matrix[1][0].equals('O') &&
                matrix[1][1].equals('O') &&
                matrix[1][2].equals('O')) {
            return true;
        }
        if (matrix[2][0].equals('O') &&
                matrix[2][1].equals('O') &&
                matrix[2][2].equals('O')) {
            return true;
        }
        if (matrix[0][0].equals('O') &&
                matrix[1][1].equals('O') &&
                matrix[2][2].equals('O')) {
            return true;
        }
        if (matrix[0][0].equals('O') &&
                matrix[1][0].equals('O') &&
                matrix[2][0].equals('O')) {
            return true;
        }
        if (matrix[0][1].equals('O') &&
                matrix[1][1].equals('O') &&
                matrix[2][1].equals('O')) {
            return true;
        }
        if (matrix[0][2].equals('O') &&
                matrix[1][2].equals('O') &&
                matrix[2][2].equals('O')) {
            return true;
        }
        if (matrix[0][2].equals('O') &&
                matrix[1][1].equals('O') &&
                matrix[2][0].equals('O')) {
            return true;
        }
        return false;
    }
    public Boolean isTie () {
        if (isInFavorOfO().equals(false) &&
                isInFavorOfX().equals(false)) {
            return true;
        }
        return false;
    }
    public String getWinner () {
        String result = "";
        if(isInFavorOfX().equals(true)) {
            result = "X";
        }
        if(isInFavorOfO().equals(true)) {
            result = "O";
        }
        return result;
    }
}
