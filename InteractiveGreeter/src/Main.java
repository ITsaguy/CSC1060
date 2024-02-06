import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask for name
        System.out.println("Hello! May I get your name? ");
        // Set name variable
        String name = in.nextLine();

        // Ask where they're from
        System.out.println("Where are you from " + name + "? ");
        // Set location variable
        String location = in.nextLine();

        // Ask for their age
        System.out.println("Can I ask how old you are? ");
        // Set age variable
        while (!in.hasNextInt()) {
            // Clear the invalid input before prompting again.
            in.next();
            System.out.println("That is not in years, " + name + ". Can I get that again in years? ");
        }
        int age = in.nextInt();
        // Consume the leftover newline character.
        in.nextLine();
        // Output location and age in a statement
        System.out.println("So you are from " + location + " and you are " + age + ", is that correct " + name + "?");

        // Ask for favorite hobby
        System.out.println("I'm from HELL myself. I love to bike. How about you, what's your favorite hobby? ");
        // Set hobby variable
        String hobby = in.nextLine();
        // Output the hobby
        System.out.println("You like to " + hobby + "? Sounds interesting.");

        // Initialize the donation variable
        double donation = 0.0;
        // Flag to check valid input
        boolean validInput = false;
        // Regular expression to check for monetary format (e.g., 10.00)
        String moneyPattern = "^\\d+(\\.\\d{1,2})?$";

        // Ask for the donation amount
        while (!validInput) {
            System.out.println("How much will you be donating today? ");
            // Set input as a string
            String input = in.nextLine();

            // Check if the input matches the monetary format
            if (input.matches(moneyPattern)) {
                // If yes, parse the string to double and set validInput to true
                donation = Double.parseDouble(input);
                // Break the loop
                validInput = true;
            } else {
                // If not, ask for the amount again
                System.out.print("I'll need that in dollars and cents (e.g., 10.00). Once again... ");
            }
        }

        // Output the donation amount
        System.out.println("Great! Thank you for your donation of $" + String.format("%.2f", donation) + ".");
    }
}