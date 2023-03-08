import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);

        // input from command line
        int num = sc.nextInt();

        int i = 0;                // count from 0 to n
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals n
        System.out.println("i value  |  Power of 2");
        while (i <= num) {

            System.out.println("   "+i + "     |      " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                                // double to get the next one
            i++;
        }

    }
}
