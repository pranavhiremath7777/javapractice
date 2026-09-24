import java.util.Random;
import java.util.Scanner;

public class rockPaperSisccor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("Enter your choice (Rock, Paper, Scissors): ");

        String userChoice = sc.nextLine();

        // Generate computer choice
        String computerChoice = choices[random.nextInt(3)];

        System.out.println("Computer chose: " + computerChoice);

        // Decide winner
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a Tie!");
        } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You Win!");
        } else if (
                userChoice.equalsIgnoreCase("Rock") ||
                userChoice.equalsIgnoreCase("Paper") ||
                userChoice.equalsIgnoreCase("Scissors")
        ) {
            System.out.println("Computer Wins!");
        } else {
            System.out.println("Invalid Input!");
        }

        sc.close();
    }
}
