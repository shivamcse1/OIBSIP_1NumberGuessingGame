import java.util.Random;
import java.util.Scanner;


    public class NumberGuessingGame {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            int lowerValue= 1;
            int upperValue = 100;
            int Guessnumber = rand.nextInt(upperValue - lowerValue + 1) + lowerValue;
            int maximumAttempts = 10;
            int Attempt = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have selected a number which range between " + lowerValue + " and " + upperValue + ".");
            System.out.println("You have " + maximumAttempts + " Attempt to guess it.");

            while (Attempt < maximumAttempts) {
                System.out.print("Enter your number for guessing: ");
                int guess = sc.nextInt();
                Attempt++;

                if (guess < lowerValue || guess > upperValue) {
                    System.out.println("Please guess a number between " + lowerValue + " and " + upperValue + ".");
                    continue;
                }

                if (guess == Guessnumber) {
                    System.out.println("Congratulations! You've guessed the correct number, which is " + Guessnumber + ".");
                    System.out.println("You took " + Attempt + " Attempt.");
                    break;
                } else if (guess < Guessnumber) {
                    System.out.println("Try higher Value. You have " + (maximumAttempts - Attempt) + " Attempt left.");
                } else {
                    System.out.println("Try lower Value. You have " + (maximumAttempts - Attempt) + " Attempt left.");
                }
            }

            if (Attempt == maximumAttempts) {
                System.out.println("Sorry, you have run out of Attempt. The correct number was " + Guessnumber + ".");
            }

            sc.close();
        }
    }


