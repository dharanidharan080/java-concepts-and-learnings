
public class E extends Thread{
	
		public void run() {
			System.out.println("Thread started: " + Thread.currentThread().getName());
		
			try {
				A a=new A();
				a.run();
				a.join();
				Thread.sleep(2000);
				B b=new B();
				b.run();
				b.join();
				Thread.sleep(2000);
				C c=new C();
				c.run();
				c.join();
				Thread.sleep(2000);
				D d=new D();
				d.run();
				d.join();
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
