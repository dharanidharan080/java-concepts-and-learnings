import java.util.Scanner;

public class C {
	static Scanner sc= new Scanner(System.in);
	public int multiply() {
		Calculator cal=new Calculator();
		System.out.println("enter the value for a and b for multiplying:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=cal.Multiplication(a, b);
		return c;
		
		
	}

}
