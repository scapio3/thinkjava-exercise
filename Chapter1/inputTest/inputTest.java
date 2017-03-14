import java.util.Scanner;
class inputTest{
	public static void main(String[] args){
	int a,b,sum;		
	Scanner input = new Scanner(System.in);
	System.out.println("Input first number :");
	a = input.nextInt();
	System.out.println("Input second number :");
	b = input.nextInt();
	sum  = a+b;
	System.out.println("Sum of numbers is " + sum);
	
	}


}