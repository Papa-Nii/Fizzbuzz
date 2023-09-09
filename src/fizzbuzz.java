import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {

        // create a scanner and accept input from the user
        System.out.println("Enter a value");
        Scanner scanner_1 = new Scanner(System.in);
        double userInput = scanner_1.nextDouble();


            if (userInput % 3 == 0 && userInput % 5 == 0) {
                System.out.println("Fizzbuzz- " + userInput + " is divisible by both 3 and 5.");
            } else if (userInput % 3 == 0) {
                System.out.println("Fizz- " + userInput + " is only divisible by 3 and not 5.");
            } else if (userInput % 5 == 0) {
                System.out.println("Buzz- " + userInput + " is only divisible by 5 and not 3.");
            } else {
                System.out.println("The number you entered is not divisible by 3 or 5 or both of them");
            }

        }


    }

