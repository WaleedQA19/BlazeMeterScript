package SeleniumAutomation.FirstTest;

public class Polymorphism {

	public static void main(String[] args) {
		
		// Polymorphism Concepts
		
	 pattern test1 = new pattern();
	 circle test2 = new circle();
	 test1.display();
	 test2.display("This is circle");

	}

}

class pattern {
	
   public void display() {
	   
	   System.out.println("This is a first pattern");
   }
}

class  circle extends pattern{
	
	   public void display(String a) {
		   
		   System.out.println(a);
	   }
	}