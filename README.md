# Number Game

This is a simple Java console application where the player tries to guess a randomly generated number between 1 and 100 within a limited number of attempts.

## Rules of the Game

- The game generates a random number between 1 and 100.
- The player's objective is to guess this number correctly within 10 attempts.
- After each guess, the game provides feedback:
  - "Your guess is too high. Try again!" if the guess is higher than the random number.
  - "Your guess is too low. Try again!" if the guess is lower than the random number.
  - "Congratulations! You guessed the correct number" if the guess matches the random number.
- The game displays the number of attempts taken.

## How to Play

1. Clone the repository or download the source code.
2. Ensure you have Java installed on your machine.
3. Compile the `NumberGame.java` file using `javac NumberGame.java`.
4. Run the compiled file using `java NumberGame`.

## Example Output

```plaintext
=====================================================================================
                                     NUMBER GAME                                     
=====================================================================================
======================================= RULES =======================================
> Random number generated between 1 and 100.
> Player aims to guess this number within 10 attempts.
> Feedback given after each guess:
    -> "Your guess is too high. Try again!" if the guess is higher.
    -> "Your guess is too low. Try again!" if the guess is lower.
    -> "Congratulations! You guessed the correct number" if the guess matches.
> Displays the number of attempts taken.
=====================================================================================

Can you guess the random number: 50
Your guess is too high. Try again!
Can you guess the random number: 25
Your guess is too high. Try again!
Can you guess the random number: 10
Your guess is too high. Try again!
Can you guess the random number: 5
Your guess is too low. Try again!
Can you guess the random number: 7
Your guess is too high. Try again!
Can you guess the random number: 6
Congratulations! You guessed the correct number
Attempts taken: 6
=====================================================================================
                            🙏 Thank you for playing! 🙏                            
