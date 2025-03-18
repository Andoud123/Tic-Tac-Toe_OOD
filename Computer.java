import java.util.Random;

public class Computer extends Player {
    
     private Random random;

    public Computer(String name){
        super("Computer");
        this.random = new Random(); // Initialize the random number generator
    }

    public String getMove() {
        int row = random.nextInt(3);
        int column = random.nextInt(3);

        // Convert to a string representation (e.g., "A1", "B2", etc.)
        char rowChar = (char) ('A' + row); // Convert to 'A', 'B', or 'C'
        String move = rowChar + Integer.toString(column + 1); // Convert to "A1", "B2", etc.

        return move;
    }
}