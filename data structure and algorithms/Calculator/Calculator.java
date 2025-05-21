
public class Calculator extends Thread {
	public int Addtion(int x, int y) {
		return x+y;
	}
	
	public  int Subtraction(int x, int y) {
		return x-y;
	}
	public  int Multiplication(int x, int y) {
		return x*y;
	}
	public  double Division(int x, int y) {
		return x/y;
	}
	
	@Override
	public void run() {
		System.out.println("calculator intialized");
	}




}
