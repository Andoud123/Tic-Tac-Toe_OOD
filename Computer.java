import java.util.Random;

public class Computer extends Player {
    
     private Random random;

    public Computer(String name){
        super("Computer");
        this.random = new Random();
    }

    public String getMove() {
        int row = random.nextInt(3);
        int column = random.nextInt(3);

        char rowChar = (char) ('A' + row);
        String move = rowChar + Integer.toString(column + 1);

        return move;
    }

/*public String getMove(Board board) {
        int[] bestMove = minimax(board, true);
        return convertToMoveString(bestMove[1], bestMove[2]); // Convert row and column to move string
    }

    private int[] minimax(Board board, boolean isMaximizing) {
        int score = evaluateBoard(board);
        if (score == 10) return new int[]{score, -1, -1}; // Computer wins
        if (score == -10) return new int[]{score, -1, -1}; // Opponent wins
        if (isBoardFull(board)) return new int[]{0, -1, -1}; // Draw

        int bestRow = -1, bestCol = -1;
        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.isCellEmpty(i, j)) {
                        board.setCell(i, j, 'O'); // Computer's move
                        int currentScore = minimax(board, false)[0];
                        board.setCell(i, j, ' '); // Undo move
                        if (currentScore > bestScore) {
                            bestScore = currentScore;
                            bestRow = i;
                            bestCol = j;
                        }
                    }
                }
            }
            return new int[]{bestScore, bestRow, bestCol};
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.isCellEmpty(i, j)) {
                        board.setCell(i, j, 'X'); // Opponent's move
                        int currentScore = minimax(board, true)[0];
                        board.setCell(i, j, ' '); // Undo move
                        if (currentScore < bestScore) {
                            bestScore = currentScore;
                            bestRow = i;
                            bestCol = j;
                        }
                    }
                }
            }
            return new int[]{bestScore, bestRow, bestCol};
        }
    }

    private int evaluateBoard(Board board) {
        // Check rows, columns, and diagonals for a win
        // Return +10, -10, or 0 based on the evaluation
    }

    private boolean isBoardFull(Board board) {
        // Check if the board is full
    }

    private String convertToMoveString(int row, int col) {
        // Convert row and column to a string representation of the move
    }
} */

}
