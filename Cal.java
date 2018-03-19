import java.util.Scanner;

public class calculator {
	
	 

	public void main(String[]args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two number");
		double x=input.nextDouble();
		System.out.println("Enter two number");
		double y =input.nextDouble();

		// ekhane user input dibe je she ki korte chai

		System.out.println("1. Add\n2.Subtract\n3.Multiplicate\n4.Divide");
		int choice = input.nextInt();

		switch(choice){
			case 1:
				addition(x,y);
				break;
			case 2:
				subtraction(x,y);
				break;
			case 3:
				multiplication(x,y);
				break;
			case 4:
				division(x,y);
				break;
			default:
				Syatem.out.println("Invalid Input");
		}


	}
	
	public void addition(int x , int y){
		double n;
		n= x+y;
		System.out.println("Addition is:"+n);
	}
	public void subtraction(int x , int y){
		double s;
		if(x>y){
			s=x-y;
			System.out.println("Subtraction is:"+s);
		}
		else
		{
			s=y-x;
			System.out.println("Subtraction is:"+s);
		}
	}
	public void division(int x , int y){
		double d;
		if(x>y){
			d=x/y;
			System.out.println("Subtraction is:"+d);
		}
		else
		{
			d=y/x;
			System.out.println("Subtraction is:"+d);
		}
		
	}
	public void multiplication(int x , int y){
		double m;
		m=x*y;
		System.out.println("Multiplication is:"+m);
	}