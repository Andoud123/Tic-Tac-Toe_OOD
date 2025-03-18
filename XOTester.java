import java.util.Scanner;

public class XOTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) { //loop to return to main menu after finishing the game
            System.out.println("\nWelcome to Tic-Tac-Toe!\n");
            System.out.println("How do you want to play? (Enter the number of your choice)\n1- Player vs Player,\n2- Player vs Computer.");
            int choice;

            while (true) {
                choice = scan.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                }
                System.out.println("Invalid choice. Try again.");
            }

            scan.nextLine();

            System.out.print("Enter Player 1's name: ");
            String player1Name = scan.nextLine();
            System.out.println(" ");
            Player player1 = new Human(player1Name);
            Player player2;

            if (choice == 1) { //Player vs Player
                System.out.print("Enter Player 2's name: ");
                String player2Name = scan.nextLine();
                System.out.println(" ");
                player2 = new Human(player2Name);
            } else {
                player2 = new Computer("Computer");
            }

            int player1Score = 0;
            int player2Score = 0;

            while (player1Score < 3 && player2Score < 3) { // Checks if none of the players had 3 wins
                Grid grid = new Grid();
                Player currentPlayer = player1;
                String currentSymbol = "X";

                while (true) {
                    grid.display();
                    System.out.println("\n" + currentPlayer.getName() + "'s turn (" + currentSymbol + "):");

                    String move;
                    int row, column;

                    while (true) {
                        move = currentPlayer.getMove();

                        if (move.length() == 2 && move.charAt(0) >= 'A' && move.charAt(0) <= 'C' &&
                            move.charAt(1) >= '1' && move.charAt(1) <= '3') {

                            row = move.charAt(0) - 'A';
                            column = move.charAt(1) - '1';

                            if (grid.isEmpty(row, column)) { // check if the cell is empty or occupied
                                break;
                            } else {
                                System.out.println("\nCell already occupied! Try again.\n");
                            }
                        } else {
                            System.out.println("\nInvalid move format!! Use A1, B2, etc.");
                        }
                    }

                    grid.squares[row][column] = currentSymbol;

                    if (grid.ifWon(currentSymbol)) { // present the winner of the current round
                        grid.display();
                        System.out.println("\n" + currentPlayer.getName() + " wins this round!");

                        if (currentPlayer == player1) {
                            player1Score++;
                        } else {
                            player2Score++;
                        }

                        System.out.println("\nCurrent Score:");
                        System.out.println(player1.getName() + ": " + player1Score);
                        System.out.println(player2.getName() + ": " + player2Score);
                        break;
                    }

                    if (grid.isDraw()) {
                        grid.display();
                        System.out.println("\nIt's a draw!");
                        break;
                    }

                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                    currentSymbol = (currentSymbol.equals("X")) ? "O" : "X";
                }

                if (player1Score == 3 || player2Score == 3) { // when it's a draw
                    break;
                }

                System.out.println("\nStarting new round...\n");
            }

            if (player1Score == 3) { // presents who is the winner of the game with the score
                System.out.println("\n" + player1.getName() + " wins the game with a score of 3!");
            } else {
                System.out.println("\n" + player2.getName() + " wins the game with a score of 3!");
            }

            while (true) { // choose if he wants to play again or exit the game
                System.out.println("\nWould you like to:\n1- Return to Main Menu\n2- Exit");
                int menuChoice = scan.nextInt();
                scan.nextLine();

                if (menuChoice == 1) {
                    System.out.println("\nReturning to Main Menu...\n");
                    break;
                } else if (menuChoice == 2) {
                    System.out.println("\nThanks for playing! Goodbye!");
                    scan.close();
                    return;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
