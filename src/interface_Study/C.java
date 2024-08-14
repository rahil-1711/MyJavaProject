package interface_Study;

public class C implements A,B{
		
		// multiple inheritance in interface using implementation class
	
	
	public static void main(String[] args)
	{
		C c=new C();
		
		c.jump();
		c.run();
		c.dance();
		c.sing();
		
	}
	
	
	
	
	
	
	@Override
	public void jump() {
		System.out.println(" this is incomplete method jump from interface B");
		
	}

	@Override
	public void run() {
		System.out.println(" this is incomplete method run from interface B");
		
	}

	@Override
	public void sing() {
		System.out.println("this is incomplete method sing from  interface A");
		
	}

	@Override
	public void dance() {
		System.out.println(" this is incomplete method dance from interface A");
		
	}

}
