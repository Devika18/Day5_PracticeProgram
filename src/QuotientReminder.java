import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args)
    {
        System.out.println("Enter dividend and divisor: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter Divisor: ");
        int divisor = sc.nextInt();

        //Calculating Quotient and Reminder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        //Printing Quotient and Reminder
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}
