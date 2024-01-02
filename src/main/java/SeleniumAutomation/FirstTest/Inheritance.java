package SeleniumAutomation.FirstTest;

public class Inheritance {

	public static void main(String[] args) {
		// Inheritance concepts
	 child test = new child();
	 test.name = "This is child calss";
	 test.second();
	 test.first();
	}

}

class Parent {
	String name;
	public void first() {
		System.out.println("This is parent class");
	}
}
 class child extends Parent {
	 public void second() {
		 System.out.println (name);
	 }
 }