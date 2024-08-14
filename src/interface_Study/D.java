package interface_Study;

public class D implements A,B{

	public static void main(String[] args) {

		D d= new D();
		
		d.run();		// calling default method from D which is incomplete in B
		A.run(); 		// calling static method from classA
		
	}
	
	public void jump() {
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		B.super.run();			// calling particular method from class B
		
	}

}
