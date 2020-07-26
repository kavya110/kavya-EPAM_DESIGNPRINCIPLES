package epam.designprinciples;
import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
	public interface Operator
	{
		int Mul(int num1, int num2);
		int Add(int num1, int num2);
		int Div(int num1, int num2);
		int Sub(int num1, int num2);
	
	}
	public static void main(String args[])
	{
		int ch,num1,num2;
		System.out.println("Enter the numbers");
		Scanner in =new Scanner(System.in);
		App a=new App();
		Operation op= a.new Operation();
		num1=in.nextInt(); 
		num2=in.nextInt();
		System.out.println("Enter the operation\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		ch=in.nextInt();
		switch(ch)
		{
		case 1: int c1 = op.Add(num1,num2);break;
		case 2: int c2 =op.Sub(num1,num2);break;
		case 3: int c3 =op.Mul(num1,num2);break;
		case 4: int c4 =op.Div(num1,num2);break;
		}
		
	}
	public class Operation implements Operator
	{
		public int Add(int num1,int num2)
		{
			System.out.println("The Added result is "+(num1+num2));
			return num1+num2;
		}
		public int Sub(int num1,int num2)
		{
			System.out.println("Result is"+(num1-num2));return (num1-num2);
		}
		public int Mul(int num1,int num2)
		{
			System.out.println("Result is"+(num1*num2));return (num1*num2);
		}
		public int Div(int num1,int num2)
		{
			System.out.println("Result is"+(num1/num2));return (num1/num2);
		}
	}
}
