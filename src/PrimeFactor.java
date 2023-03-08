import java.util.Scanner;

public class PrimeFactor {
    public static boolean isPrime(int i)
    {
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no. to find Prime Factors: ");
        int num=obj.nextInt();
        System.out.println();
        System.out.println("The Prime Factors for the "+num+" is: ");
        System.out.println();

        for(int i=2;i<=num;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
