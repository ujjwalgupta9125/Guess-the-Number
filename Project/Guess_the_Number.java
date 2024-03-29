import java.util.Scanner;
class Guess_the_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Generating the Random Number
        
        int number = (int)(10 * Math.random());
        

        //Number of Trials
        int K = 3,i = 0;

        System.out.println("A number is chosen" + " between 1 to 10.");
        System.out.println("Guess the number" + " within 3 trials.");
        // Iterate over K Trials
        for (i = 0; i < K; i++) {
 
            System.out.println("Guess the number:");
 
            // Take input for guessing
            int guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!"+ " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is"+ " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println("You have exhausted"+ " K trials.");
            System.out.println("The number was " + number);
        }
    }
}

