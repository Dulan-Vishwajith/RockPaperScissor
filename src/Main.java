import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd= new Random();

        String[] choices ={"rock","paper","scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain="yes";



        do {
            System.out.print("Enter your move ( rock,paper,scissor): ");
            playerChoice = input.nextLine().toLowerCase();

            if (
                    !playerChoice.equals("rock") &&
                            !playerChoice.equals("paper") &&
                            !playerChoice.equals("scissor")
            ) {

                System.out.println("Invalid Choice");

            } else {

                computerChoice = choices[rd.nextInt(3)];
                System.out.println(computerChoice);

                if (computerChoice.equals(playerChoice)) {
                    System.out.println("It is a tie !");

                } else if (
                                (playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                                (playerChoice.equals("scissor") && computerChoice.equals("paper"))
                ) {

                    System.out.println("You Win !");

                } else {

                    System.out.println("You lose !");

                }

            }

            System.out.print("Play again (yes/no) : ");
            playAgain = input.nextLine().toLowerCase();

        }while (playAgain.equals("yes"));
        input.close();
        System.out.println("Good Bye !");
    }

}
