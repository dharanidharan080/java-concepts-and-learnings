import java.util.Scanner;

public class B {
	static Scanner sc= new Scanner(System.in);
	public int subtract() {
		Calculator cal=new Calculator();
		System.out.println("enter the value for a and b for Subracting:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=cal.Subtraction(a, b);
		return c;
		
		
	}

	}


