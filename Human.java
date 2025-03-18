import java.util.Scanner;

public class Human extends Player {
    
    private static final Scanner scan = new Scanner(System.in);

    public Human(String name){
        super(name);
    }
    
    public Human(){
        this.name = " ";
    }

    public String getName(){ // Get player's name
        return name;
    }

    public String getMove() {
        System.out.println("Enter your move: ");
        String move = scan.next().toUpperCase();
        return move;
    }


}
