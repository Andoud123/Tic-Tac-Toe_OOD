public class Square {
    
    private int hCoordinate; // presents 1, 2, 3
    private char vCoordinate; // presents A, B, C
    private String symbol; // presents the symbols X,O
    
    public Square(int hCoordinate, char vCoordinate){
        this.hCoordinate = hCoordinate;
        this.vCoordinate = vCoordinate;
    }

    public Square(){
        this.hCoordinate = ' ';
        this.vCoordinate = 0;
        this.symbol = "";
    }

    public String getLetter(){
        return symbol;
    }

    public int getHCoordinate(){
        return hCoordinate;
    }
    
    public char getVCoordinate(){
        return vCoordinate;
    }

    public boolean isOccupied(){ // Check if the cell is not empty
        return !this.symbol.isEmpty();
    }

    public String toString() {
        return symbol.isEmpty() ? " " : symbol;
    }

}
