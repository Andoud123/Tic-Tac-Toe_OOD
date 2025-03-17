public class Grid {
    
    String[][] squares;
    private int row;
    private int column;
    public static final int SIZE = 3;

    public Grid(){
        squares = new String[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    squares[i][j] = " ";
                }
            }
    }

    public String getSquare() {
        if (row < 0 || row > 2 || column < 0 || column > 2)
        return null;
        return this.squares[row][column];
    }

    public boolean isEmpty(int row, int column){
        return squares[row][column].equals(" ");
    }    

    public boolean ifWon(String symbol){
        String letter = String.valueOf(symbol);
        for (int i = 0; i < SIZE; i++) {
            if ((squares[i][0].equals(letter) && squares[i][1].equals(letter) && squares[i][2].equals(letter)) ||
                (squares[0][i].equals(letter) && squares[1][i].equals(letter) && squares[2][i].equals(letter))) {
                return true;
            }
            if ((squares[0][0].equals(letter) && squares[1][1].equals(letter) && squares[2][2].equals(letter)) ||
            (squares[0][2].equals(letter) && squares[1][1].equals(letter) && squares[2][0].equals(letter))) {
            return true;
            }
        }
        return false;
    }

    public boolean isDraw(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isEmpty(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void display(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(squares[i][j]);
                if (j < SIZE - 1) System.out.print("  |  ");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("-------------");
        }
    }

}
