
public class E extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		
		a.start();
		a.join();
		Thread.sleep(3000);
		b.start();
		b.join();
		Thread.sleep(3000);
		c.start();
		c.join();
		Thread.sleep(3000);
		d.start();
		
	}
	

}
