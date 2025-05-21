
public class E extends Thread{
	
		public void run() {
			System.out.println("Thread started: " + Thread.currentThread().getName());
		
			try {
				int a=A.Calculator(1,2);
				System.out.println("addtion"+a);
				Thread.sleep(5000);
				int b=B.Calculator(5, 6);
				
				System.out.println("subtraction"+b);
				Thread.sleep(5000);
				int c=C.Calculator(5, 6);
				System.out.println("multiplication"+c);
				Thread.sleep(5000);
				int d=(int) D.Calculator(9, 2);
				System.out.println("division"+d);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			System.out.println("Thread finished " + Thread.currentThread().getName());
			
			
		}
		
		public static void main(String[] args) throws InterruptedException {
			E thread=new E();
			thread.start();
			Thread.sleep(5000);
			thread.join();
			System.out.println("Main thread finished");
					}
	
	

}
