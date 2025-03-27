}import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Enter your choice: ");
        System.out.println("1 for Rock");
        System.out.println("2 for Paper");
        System.out.println("3 for Scissors");

        int userChoice = scanner.nextInt();

        System.out.println("\nComputer's choice: " + getChoiceName(computerChoice));
        System.out.println("Your choice: " + getChoiceName(userChoice));

        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);
        
        scanner.close();
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }

    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        }

        switch (userChoice) {
            case 1: 
                if (computerChoice == 2) {
                    return "Computer wins! Paper covers Rock.";
                } else {
                    return "You win! Rock crushes Scissors.";
                }

            case 2:
                if (computerChoice == 3) {
                    return "Computer wins! Scissors cut Paper.";
                } else {
                    return "You win! Paper covers Rock.";
                }

            case 3:
                if (computerChoice == 1) {
                    return "Computer wins! Rock crushes Scissors.";
                } else {
                    return "You win! Scissors cut Paper.";
                }

            default:
                return "Invalid input! Please enter 1, 2, or 3.";
        }
    }
}

