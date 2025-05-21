import java.util.Scanner;

public class A {
	static Scanner sc= new Scanner(System.in);
	public int add() {
		Calculator cal=new Calculator();
		System.out.println("enter the value for a and b for adding:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=cal.Addtion(a, b);
		return c;
		
		
	}

}
