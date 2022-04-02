 // Java Program to Check Leap Year
import java.util.Scanner; 
public class assign6 {
   public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Year");
		int n = sc.nextInt();
		if(n%4==0 && n%100!=0)
		{
			System.out.println("Leap year");
		}
		else if(n%400==0)
		{
			System.out.println("Leap year");
		}
		else 
		{
			System.out.println("Not a leap year");
		}
    }
}