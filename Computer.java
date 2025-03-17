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
}
