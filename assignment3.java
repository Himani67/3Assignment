import java.util.Scanner;
import java.util.Random;

public class assignment3 {
    public static void main(String[] args) {
        String validUsername = "sifalschool";
        String validPassword = "098778";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String usernameInput = input.nextLine();
        System.out.println("Enter your password:");
        String passwordInput = input.nextLine();

        if (usernameInput.equals(validUsername) && passwordInput.equals(validPassword)) {
            System.out.println("Login Successful");

            System.out.println("Choose an option:");
            System.out.println("1) Calculator");
            System.out.println("2) Number Guessing Game");
            System.out.println("3) Simple Interest Calculator");
            System.out.println("4) Check if a character is a vowel or consonant");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("You have selected the Calculator.");
                    System.out.println("Enter the first number:");
                    int num1 = input.nextInt();
                    System.out.println("Enter the second number:");
                    int num2 = input.nextInt();
                    System.out.println("Enter an operator (+, -, *, /):");
                    char operator = input.next().charAt(0);

                    int result = 0;

                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                System.out.println("Division by zero is not allowed.");
                            }
                            break;
                        default:
                            System.out.println("Operator not found");
                    }

                    System.out.println("Result: " + result);
                    break;

                case 2:
                    Random random = new Random();
                    int randomNumber = random.nextInt(10);
                    System.out.println("You have selected the Number Guessing Game.");
                    System.out.println("Enter a number from 0 to 10:");
                    int userGuess = input.nextInt();

                    if (userGuess == randomNumber) {
                        System.out.println("Congratulations, you won!");
                    } else {
                        System.out.println("Try again.");
                    }
                    break;

                case 3:
                    System.out.println("You have selected the Simple Interest Calculator.");
                    System.out.println("Enter the principal amount:");
                    int principal = input.nextInt();
                    System.out.println("Enter the annual interest rate:");
                    double rate = input.nextDouble();
                    System.out.println("Enter the time in years:");
                    int time = input.nextInt();

                    double simpleInterest = (principal * rate * time) / 100;
                    System.out.println("Simple Interest = " + simpleInterest);
                    break;

                case 4:
                    System.out.println("You have selected the Vowel or Consonant Checker.");
                    System.out.println("Enter a lowercase character:");
                    char character = input.next().charAt(0);

                    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                        System.out.println(character + " is a vowel.");
                    } else {
                        System.out.println(character + " is a consonant.");
                    }
                    break;

                default:
                    System.out.println("Option not found.");
                    break;
            }
        } else {
            System.out.println("Login Failed");
        }
    }
}
