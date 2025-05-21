public class D extends Thread{

		 @Override
			public void run() {
				Calculator c=new Calculator();
				double res=c.Division(2, 3);
				System.out.println("division result"+res);
				
				
			}
		
		
	 }




