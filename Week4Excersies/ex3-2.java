import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class Testex03ch02 {
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0; //?4
        int scoreCount = 0;
        int testScore = 0;
        int minScore = 0; //?3
        int maxScore = 100; //?3
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount += 1; //?2
                scoreTotal += testScore; //?2
                minScore = Math.min(minScore, testScore); //?3
                maxScore = Math.max(maxScore, testScore); //?3
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }

        // display the score count, score total, and average score
        double averageScore = scoreTotal / scoreCount; //?4
        NumberFormat number = NumberFormat.getNumberInstance(); //?5
        number.setMaximumFractionDigits(1); //?5
        String message = "\n" +
                "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + number.format(averageScore) + "\n"
                + "Low score: " + minScore + "\n"
                + "High score: " + maxScore + "\n";

        System.out.println(message);
    }
}

