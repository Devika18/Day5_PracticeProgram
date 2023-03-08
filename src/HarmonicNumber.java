import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        // Intializing and declaring the variables
        double result = 0, num = 0, j;
        int num1;
        Scanner sc = new Scanner(System.in);

        // Input from command line
        System.out.println("Enter the harmonic you want to find: ");
        num1 = sc.nextInt();

        // Checking result of Harmonic Number
        for (j = 1; j <= num1; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("The value of harmonic no. " + num1 + " is: " + result);

    }
}
