import java.util.Scanner;
public class guessing
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=5;
        int i=0;
        int n;
        int number = 1 + (int)(100* Math.random());
        System.out.println("Welcome to the number guessing game..");
        while(i<k)
        {
            System.out.println("Enter the number between 1 to 100");
            n=sc.nextInt();
            if(n==number)
            {
                System.out.println("Congo!!! Guessed correctly");
                System.out.println("Your Score is "+(50-(10*(5-k))));
                break;
            }
            else if(n<number)
            {
                System.out.println("Number is greater");
                k--;
                System.out.println("Trials left "+k);
            }
            else
            {
                System.out.println("Number is lesser");
                k--;
                System.out.println("Trials left "+k);
            }
        }
        if (i==k) {
            System.out.println("Sorry!! You have exhausted trials.");
            System.out.println("The number was " + number);
        }
    }
}
    
