import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\nRock, Paper, Scissors Game");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");

            int userChoice = scanner.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please choose a number between 1 and 3.");
                continue;
            }

            String userMove = choices[userChoice - 1];
            String computerMove = choices[random.nextInt(3)];

            System.out.println("Your move: " + userMove);
            System.out.println("Computer's move: " + computerMove);

            // Determine the winner
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("Rock") && computerMove.equals("Scissors")) ||
                    (userMove.equals("Paper") && computerMove.equals("Rock")) ||
                    (userMove.equals("Scissors") && computerMove.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
