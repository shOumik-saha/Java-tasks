import java.util.Scanner;
public class AddSub
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input 1st number");
		int num1=input.nextInt();
		
		System.out.println("Input the 2nd nummber");
		int num2 = input.nextInt();
		input.close();
		int d=(num1/num2);
		System.out.println("The divison is:"+d);
		
		int sum=(num1+num2);
		System.out.println("The addition or sum:"+sum);
		
		int mult=(num1*num2);
		System.out.println("The multiplication is:"+mult);
		
		int sub=(num1-num2);
		System.out.println("The substraction is:"+sub);
		
		int rem=(num1%num2);
		System.out.println("The remainder is:"+rem);
	}
}