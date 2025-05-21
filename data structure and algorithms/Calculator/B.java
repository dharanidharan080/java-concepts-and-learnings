public class B extends Thread{
	 
		  @Override
			public void run() {
				Calculator c=new Calculator();
				int res=c.Subtraction(2, 3);
				System.out.println("Subtraction result"+res);
				
				
			}
		
		
	 }
