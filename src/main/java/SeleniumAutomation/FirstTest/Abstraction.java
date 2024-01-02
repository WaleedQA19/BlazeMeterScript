package SeleniumAutomation.FirstTest;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 mountainbike test1 = new mountainbike();
 sportsbike test2 = new sportsbike();
 
 test1.brake();
 test2.brake();
	}

}

abstract class motorbike{
	abstract void brake ();
	
}

class sportsbike extends motorbike{
	public void brake() {
	System.out.println("This is sportsbike");
}
	
}

class mountainbike extends motorbike{
	public void brake() {
	System.out.println("This is mountainbike");
}
	
}