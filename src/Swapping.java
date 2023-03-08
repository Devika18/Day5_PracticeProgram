import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("Enter value of a and b: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int temp;
        System.out.println("Before Swapping value of a and b is: "+a+"  "+b);
        if(a<b) {
            temp = a;
            a = b;
            b = temp;
            System.out.println("a value: "+a+"  b value: "+b);
        }
        else {
            System.out.println("Unable to do swapping");
        }
    }
}
