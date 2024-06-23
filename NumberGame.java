import java.util.*;
public class NumberGame {
    Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args){
        NumberGame NG = new NumberGame();
        NG.displayIntroduction();
        NG.StartGame();
    }

    public void displayIntroduction() {
        System.out.println("=====================================================================================");
        System.out.println("                                     NUMBER GAME                                     ");
        System.out.println("=====================================================================================");
        System.out.println("======================================= RULES =======================================");
        System.out.println("> Random number generated between 1 and 100.");
        System.out.println("> Player aims to guess this number within 10 attempts.");
        System.out.println("> Feedback given after each guess:");
        System.out.println("    -> \"Your guess is too high. Try again!\" if the guess is higher.");
        System.out.println("    -> \"Your guess is too low. Try again!\" if the guess is lower.");
        System.out.println("    -> \"Congratulations! You guessed the correct number\" if the guess matches.");
        System.out.println("> Displays the number of attempts taken.");
        System.out.println("=====================================================================================");
        System.out.println();
    }

    public int NumberGenerator(){
        return (int)(Math.random() * 100) + 1;
    }

    public int GetUserNumber(){
        System.out.print("Can you guess the random number: ");
        int UserGuess = scanner.nextInt();
        return UserGuess;
    }

    public void StartGame(){
        NumberGame NG = new NumberGame();
        int randomNumber = NumberGenerator();
        int attempts = 0;
        int maxattempts = 10;
        while(attempts < maxattempts)
        {
            attempts++;
            int num = NG.GetUserNumber();

            if(num > randomNumber){
                System.out.println("Your guess is too high. Try again!");
            }else if(num < randomNumber){
                System.out.println("Your guess is too low. Try again!");
            }else{
                System.out.println("Congratulations! You guessed the correct number");
                System.out.println("Attempts taken: " + attempts);
                System.out.println("=====================================================================================");
                System.out.println("                            🙏 Thank you for playing! 🙏                            ");
                break;
            }
        }
        System.out.println();
        System.out.println("Attempts taken: " + attempts);
        System.out.println("=====================================================================================");
        System.out.println("                               Thank you for playing!                                ");
    }
}
