import java.util.Scanner;
public class assesment
{
public static void main(String[] args)
{
  int n;
  int i;
  boolean isPrime = true;
  System.out.print("Enter a positive integer: ");
  Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
  for (i = 2; i <= n / 2; ++i)
  {
	  if (n % i == 0)
	  {
		  isPrime = false;
		  break;
	  }
  }
  if (isPrime)
  {
	  System.out.print("This is a prime number");
  }
  else
  {
	  System.out.print("This is not a prime number");
  }

}
}