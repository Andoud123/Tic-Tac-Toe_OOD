public class Square {
    
    private char hCoordinate;
    private int vCoordinate;
    private String symbol;
    
    public Square(char hCoordinate, int vCoordinate){
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

    public char getHCoordinate(){
        return hCoordinate;
    }
    
    public int getVCoordinate(){
        return vCoordinate;
    }

    public boolean isOccupied(){
        return !this.symbol.isEmpty();
    }

    public String toString() {
        return symbol.isEmpty() ? " " : symbol;
    }

}
