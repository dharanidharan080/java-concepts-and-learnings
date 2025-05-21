import java.util.Scanner;

public class D {
	static Scanner sc= new Scanner(System.in);
	public double divide() {
		Calculator cal=new Calculator();
		System.out.println("enter the value for a and b for dividing:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=cal.Division(a, b);
		return c;
		
		
	}
	}


