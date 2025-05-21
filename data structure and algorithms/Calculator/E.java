
public class E extends Thread{
	
		public void run() {
			System.out.println("Thread started: " + Thread.currentThread().getName());
		
			try {
				A a=new A();
				System.out.println("addtion"+" "+a.add());
				Thread.sleep(2000);
				B b=new B();
				
				System.out.println("subtraction"+" "+b.subtract());
				Thread.sleep(2000);
				C c=new C();
				System.out.println("multiplication"+" "+c.multiply());
				Thread.sleep(2000);
				D d=new D();
				System.out.println("division"+" "+d.divide());
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
