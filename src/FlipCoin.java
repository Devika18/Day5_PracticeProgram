import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        // Initializing and declaring the variables
        int n, head_cnt = 0, tail_cnt = 0;
        double heads, tails;
        Scanner obj = new Scanner(System.in);

        // Giving input from command line
        System.out.println("enter no. of times you want to flip the coin: ");
        n = obj.nextInt();

        //Printing random values for n number of times
        for (int j = 0; j < n; j++) {
            double random = Math.random();
            System.out.println("Random values are: "+Math.random());
            if (random < 0.5)
                tail_cnt++;
            else
                head_cnt++;
        }

        //Calculating Percentage of heads and tails
        heads = head_cnt / (double) n * 100;
        tails = tail_cnt / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");

    }
}
