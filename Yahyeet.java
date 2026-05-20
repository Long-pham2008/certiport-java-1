import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Yahyeet
{
    /**
     * Precondition: args[0] is the name of a file and 1 <= args[1] <= 10
     */
    public static void main(String[] args) throws IOException
    {
        if (args.length >= 2)
        {
            System.out.println("You entered\nargs[0]: " + args[0] + "\nargs[1]: " + args[1]);

            // TO DO: Calculate student average scores here
            Scanner input = new Scanner(new File(args[0]));
            int group = Integer.parseInt(args[1]);

            int count = 0;
            double sum = 0.0;
            while (input.hasNextInt()) // still has next term
            {
                int score = input.nextInt();
                sum = sum + score;
                count++;
            }

            if (count > 0)
            {
                double average = sum / count;
                System.out.println("Average score is: " + average);
            }

            else
            {
                System.out.println("Not found");
            }
        }
        else
        {
            System.out.println("Not enough inputs entered.\nFormat: java Yahyeet filename numValues");
        }
    }
}