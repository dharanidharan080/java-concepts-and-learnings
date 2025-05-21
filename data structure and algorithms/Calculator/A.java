

public class A extends Thread{
	 
		 @Override
			public void run() {
				Calculator c=new Calculator();
				c.start();
				try {
					c.join();
					Thread.sleep(2000);
					int res=c.Addtion(2, 3);
					System.out.println("addition result"+res);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				
			}
		
		
	 }


