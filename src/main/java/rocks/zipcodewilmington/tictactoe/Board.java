package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    boolean result = false;
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean checkHorizontal(char value) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix.length; x++) {
                if (matrix[y][x] != value) {
                    break;
                } else if (x == matrix.length - 1) {
                    return result = true;
                }
            }
        }
        return false;
    }
    public boolean checkVertical(char value) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                if (matrix[y][x] != value) {
                    break;
                } else if (y == matrix.length - 1) {
                    return result = true;
                }
            }
        }
        return false;
    }
    public boolean checkDiagonal(char value) {
        for (int x = 0; x < matrix.length; x++) {
            if (matrix[x][x] != value) {
                break;
            } else if (x == matrix.length-1) {
                return result = true;
            }
        }
        return false;
    }
    public boolean checkInverseDiagonal(char value) {
        for (int x = 0; x < matrix.length; x++) {
            if (matrix[x][(matrix.length-1)-x] != value) {
                break;
            } else if (x == matrix.length-1) {
                return result = true;
            }
        }
        return false;
    }

    public Boolean isInFavorOfX () {
        checkHorizontal('X');
        checkVertical('X');
        checkDiagonal('X');
        checkInverseDiagonal('X');
        return result;
    }
//        if (matrix[0][0].equals('X') &&
//                matrix[0][1].equals('X') &&
//                matrix[0][2].equals('X')) {
//            return true;
//        }
//        if (matrix[1][0].equals('X') &&
//                matrix[1][1].equals('X') &&
//                matrix[1][2].equals('X')) {
//            return true;
//        }
//        if (matrix[2][0].equals('X') &&
//                matrix[2][1].equals('X') &&
//                matrix[2][2].equals('X')) {
//            return true;
//        }
//        if (matrix[0][0].equals('X') &&
//                matrix[1][1].equals('X') &&
//                matrix[2][2].equals('X')) {
//            return true;
//        }
//        if (matrix[0][0].equals('X') &&
//                matrix[1][0].equals('X') &&
//                matrix[2][0].equals('X')) {
//            return true;
//        }
//        if (matrix[0][1].equals('X') &&
//                matrix[1][1].equals('X') &&
//                matrix[2][1].equals('X')) {
//            return true;
//        }
//        if (matrix[0][2].equals('X') &&
//                matrix[1][2].equals('X') &&
//                matrix[2][2].equals('X')) {
//            return true;
//        }
//        if (matrix[0][2].equals('X') &&
//                matrix[1][1].equals('X') &&
//                matrix[2][0].equals('X')) {
//            return true;
//        }
//        return false;
//    }
    public Boolean isInFavorOfO () {
        checkHorizontal('O');
        checkVertical('O');
        checkDiagonal('O');
        checkInverseDiagonal('O');
        return result;
//        if (matrix[0][0].equals('O') &&
//                matrix[0][1].equals('O') &&
//                matrix[0][2].equals('O')) {
//            return true;
//        }
//        if (matrix[1][0].equals('O') &&
//                matrix[1][1].equals('O') &&
//                matrix[1][2].equals('O')) {
//            return true;
//        }
//        if (matrix[2][0].equals('O') &&
//                matrix[2][1].equals('O') &&
//                matrix[2][2].equals('O')) {
//            return true;
//        }
//        if (matrix[0][0].equals('O') &&
//                matrix[1][1].equals('O') &&
//                matrix[2][2].equals('O')) {
//            return true;
//        }
//        if (matrix[0][0].equals('O') &&
//                matrix[1][0].equals('O') &&
//                matrix[2][0].equals('O')) {
//            return true;
//        }
//        if (matrix[0][1].equals('O') &&
//                matrix[1][1].equals('O') &&
//                matrix[2][1].equals('O')) {
//            return true;
//        }
//        if (matrix[0][2].equals('O') &&
//                matrix[1][2].equals('O') &&
//                matrix[2][2].equals('O')) {
//            return true;
//        }
//        if (matrix[0][2].equals('O') &&
//                matrix[1][1].equals('O') &&
//                matrix[2][0].equals('O')) {
//            return true;
//        }
//        return false;
    }
    public Boolean isTie () {
        if (isInFavorOfO() == false &&
        isInFavorOfX() == false) {
            return result = true;
        } else {
            return result = false;
        }
    }
    public String getWinner () {
        if(isInFavorOfX() == true) {
            return "X";
        } else if (isInFavorOfO() == true) {
            return "O";
        }
        return "";
    }
}
